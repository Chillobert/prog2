
/*
 *
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
     
    private boolean placeToken(char[][] field, int column, char currentToken) {

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
 
    private void readInput(boolean playerTurn){
        boolean validInput;
        Scanner input = new Scanner(System.in);
        int columnIn;
                    
        do{
            System.out.print("Choose column (1-7) for a token:");
            if(input.hasNextInt()){
                columnIn = input.nextInt();
                validInput=true;
            }
            else{
                validInput=false;
                System.out.println("please insert valid input.");
                input.nextLine();
                continue;
            }
            if (columnIn < 1 || columnIn > 7) {
                validInput=false;
                System.out.println("Column should be from 1 to 7");
                continue;
            }
            if (!placeToken(field, columnIn - 1, playerTurn ? 'X' : 'O')) {
                validInput=false;
                System.out.println("This column is filled! Choose another one.");
            }
            }while(!validInput);
    }
    
    private void winnerOut(char result){
            switch (result) {
                case 'D':
                    System.out.println("It's a draw!");
                    //winFlag = true;
                    break;
                case 'X':
                    System.out.println("Player 1 wins!");
                    //winFlag = true;
                    break;
                case 'O':
                    System.out.println("Player 2 wins!");
                    //winFlag = true;
                    break;
                default:
                    break;
            }        
    }
    
    public int bot(){
        int column = (int)(Math.random()*6);
        placeToken(field,column,'O');
        return column;
    }
    
    public void play(){
        MakeField mField = new MakeField();
        WinRequest winner = new WinRequest(); //Objekt auﬂerhalb der While schleife, damit es nicht in jedem Zug ein neues gibt
        char result=' ';
        boolean playerTurn = true; //True, Player1

        // Initialize with spaces
        for (int i = 0; i < 7; ++i)
            for (int j = 0; j < 7; ++j)
                field[i][j] = ' ';
        
        mField.print(field);
 
        while (!winFlag) {
            if (playerTurn)
                System.out.println("P1's turn!");
            else
                System.out.println("P2's turn!");
            if(!playerTurn&&singlePlayer)
                bot();                
            else
                readInput(playerTurn);
            mField.print(field);
            result = winner.getWinner(field,rowInput,columnInput);//Gewinner Abfrage jeden Zug
            if(result!=' ')
                winFlag=true;
            playerTurn = !playerTurn;
        }
            winnerOut(result);
    }
}