package prog2_a1;

public class Activity {
    private boolean singlePlayer=false;
    private final char[][] field;
    private boolean winFlag=false;
    public int rowInput;
    public int columnInput;
    Interaction inter;

    public Activity(boolean SinglePlayer){
        inter = new Interaction();
        singlePlayer = SinglePlayer;
        field = new char[7][7];
}
    
    public boolean placeToken(char[][] field, int column, char currentToken) {

        if (field[0][column] != ' '){
            inter.output('F');
            return false;
        }
 
        for (int row = 0; row < 7; ++row) {
            if (field[row][column] != ' ') {
                field[row-1][column] = currentToken;      
                rowInput = row-1;
                columnInput =column;
                return true;
            }
        }
        field[6][column] = currentToken;
        rowInput = 6;
        columnInput = column;
        return true;
    }
 
    public int bot(){
        int column = (int)(Math.random()*6);
        placeToken(field,column,'O');
        return column;
    }
    
    public void play(){
        Field Field = new Field(field);
        char result=' ';
        boolean playerTurn = true; //True, Player1

        Field.print(field);
        int columnIn;
        char a = '1';
        while (!winFlag) {
            if (playerTurn)
                inter.output('1');
            else
                inter.output('2');
            if(!playerTurn&&singlePlayer)
                bot();                
            else{
                for(boolean valid = false; !valid;){
                    inter.output('I');
                    columnIn = inter.readInput(playerTurn);
                    valid = placeToken(field,columnIn,playerTurn?'X':'O');
                    if(!valid)
                    inter.output('F');
                }
            }
            Field.print(field);
            result = Field.getWinner(field,rowInput,columnInput);//Gewinner Abfrage jeden Zug
            if(result!=' ')
                winFlag=true;
            playerTurn = !playerTurn;
        }
            inter.output(result);
    }
}
