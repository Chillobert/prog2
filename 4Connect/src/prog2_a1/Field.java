
package prog2_a1;


public class Field {
    private int columnInput;
    private int rowInput;
    public Field(){};
    	
        public void print(char[][] field){
        for (int row = 0; row < 7; ++row) {
        System.out.print("| ");
        for (int col = 0; col < 7; ++col)
            System.out.print(field[row][col] + "| ");
        System.out.println();
        }
 
        // Print bottom line
        for (int col = 0; col < 6; ++col)
            System.out.print("====");
        System.out.println();
    }
        
        
        private int getWinnerInRowsLeft(char[][] field) {
        	int Counter = 1;
            for (int i = 1; i <=3 ; i++){
                if(columnInput-i >= 0){    		
        		if(field[rowInput][columnInput] == field[rowInput][columnInput-i])
                        Counter++;
        		else{
                        return Counter;
        		}
                }
        	}
            return Counter;
        }
        
        private int getWinnerInRowsRight(char[][] field) {
        	int Counter = 1;
            for (int i = 1; i <=3 ; i++){
                if(columnInput+i < 7){    		
        		if(field[rowInput][columnInput] == field[rowInput][columnInput+i])
                        Counter++;
        		else{
                        return Counter;
        		}
                }
        	}
            return Counter;
        }
        
        private int getWinnerinDiagonalsTopLeft(char[][] field){
        	int Counter = 1;
            for (int i = 1; i <=3 ; i++){
                if(rowInput-i >= 0 && columnInput-i >= 0){    		
        		if(field[rowInput][columnInput] == field[rowInput-i][columnInput-i])
                        Counter++;
        		else{
                        return Counter;
        		}
                }
        	}
            return Counter;
        }
        
        private int getWinnerinDiagonalsBotRight(char[][] field){
        	int Counter = 1;
        	for (int i = 1; i <=3 ; i++){
                if(rowInput+i < 7 && columnInput+i < 7){
        		if(field[rowInput][columnInput] == field[rowInput+i][columnInput+i])
                        Counter++;
        		else{
                        return Counter;
        		}
                }
        	} 
        	return Counter;
        }
        
        private int getWinnerinDiagonalsBotLeft(char[][] field){
        	int Counter = 1;
            for (int i = 1; i <=3 ; i++){
                if(rowInput-i >= 0 && columnInput+i < 7){
        		if(field[rowInput][columnInput] == field[rowInput-i][columnInput+i])
                        Counter++;
                        else{
        			return Counter;
                        }
                }
        	}
            return Counter;
        }
        
        private int getWinnerinDiagonalsTopRight(char[][] field){
        	int Counter = 1;
            for (int i = 1; i <=3 ; i++){
                if(rowInput+i < 7 && columnInput-i >= 0){
                    if(field[rowInput][columnInput] == field[rowInput+i][columnInput-i])
                        Counter++;
                        else{
                            return Counter;
                        }
                }
            }
            return Counter;
        }
        
        private char getWinnerInRows(char[][] field){
            if (getWinnerInRowsRight(field) + getWinnerInRowsLeft(field) >=4){
            	return field[rowInput][columnInput];
            }
            return' ';
        }
           
        private char getWinnerInColumns(char[][] field) {
        	int Counter = 1;
            for (int i = 1; i <=3 ; i++){
                if(rowInput+i < 7){    		
        		if(field[rowInput][columnInput] == field[rowInput+i][columnInput])
                        Counter++;
                }
        	}
            if(Counter>=4)
                return field[rowInput][columnInput];
            return ' ';
        }
            
        private char getWinnerInDiagonals(char[][] field) {
        	
        	if (getWinnerinDiagonalsTopLeft(field) + getWinnerinDiagonalsBotRight(field) >=4
        			|| getWinnerinDiagonalsTopRight(field) + getWinnerinDiagonalsBotLeft(field)>=4)
        		return field[rowInput][columnInput];
        	return ' ';
        }
     
        public char getWinner(char[][] field, int currentRow,int currentColumn) {
            rowInput = currentRow;
            columnInput = currentColumn;
            char playerWin = getWinnerInRows(field);
            if (playerWin != ' ') 
                return playerWin;
            playerWin = getWinnerInColumns(field);
            if (playerWin != ' ') 
                return playerWin;
            playerWin = getWinnerInDiagonals(field);
            if (playerWin != ' ') 
                return playerWin;
     
            //Überprüfe ob leeres Feld vorhanden ist
            for (int i = 0; i < field.length; ++i)
                for (int j = 0; j < field[i].length; ++j)
                    if (field[i][j] == ' ') 
                        return ' ';
     
            return 'D';
        }
     
        
        
        
        
        
        
        
        
}
