

package prog2_a1;
 
import java.util.Scanner;

public class Activity {
    private boolean singlePlayer=false;
    private final char[][] field;
    private boolean winFlag=false;
    public int rowInput;
    public int columnInput;
    
     
    public Activity(boolean SinglePlayer){
        singlePlayer = SinglePlayer;
        field = new char[7][7];
}
    
    public boolean placeToken(char[][] field, int column, char currentToken) {

        if (field[0][column] != ' ')
            return false;
 
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
    	Interaction inter = new Interaction();
        Field Field = new Field();
        char result=' ';
        boolean playerTurn = true; //True, Player1

        // Initialize with spaces
        for (int i = 0; i < 7; ++i)
            for (int j = 0; j < 7; ++j)
                field[i][j] = ' ';
        
        Field.print(field);
        int columnIn = 0;
        while (!winFlag) {
            if (playerTurn)
                System.out.println("P1's turn!");
            else
                System.out.println("P2's turn!");
            if(!playerTurn&&singlePlayer)
                bot();                
            else
                columnIn = inter.readInput(playerTurn,field);
            if (!placeToken(field, columnIn, playerTurn ? 'X' : 'O')) {
                validInput=false;
                System.out.println("This column is filled! Choose another one.");
 
            Field.print(field);
            result = Field.getWinner(field,rowInput,columnInput);//Gewinner Abfrage jeden Zug
            if(result!=' ')
                winFlag=true;
            playerTurn = !playerTurn;
        }
            winnerOut(result);
    }
}