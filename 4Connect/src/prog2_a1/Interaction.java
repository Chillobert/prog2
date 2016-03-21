package prog2_a1;

import java.util.Scanner;

public class Interaction {
	
    public int readInput(boolean playerTurn, char[][] field){
        boolean validInput;
        Scanner input = new Scanner(System.in);
        int columnIn=0;
                    
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

            }while(!validInput);
        return columnIn-1;
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
}
