package prog2_a1;

public class WinRequest {
    private int columnInput;
    private int rowInput;
    private int CounterOne =1;
    private int CounterTwo =1;
    public WinRequest(){
    }
    
    private void getWinnerInRowsLeft(char[][] field) {
        for (int i = 1; i <=3 ; i++){
            if(columnInput-i >= 0){    		
    		if(field[rowInput][columnInput] == field[rowInput][columnInput-i])
                    CounterOne++;
    		else{
                    return;
    		}
            }
    	}
    }
    
    private void getWinnerInRowsRight(char[][] field) {
        for (int i = 1; i <=3 ; i++){
            if(columnInput+i < 7){    		
    		if(field[rowInput][columnInput] == field[rowInput][columnInput+i])
                    CounterOne++;
    		else{
                    return;
    		}
            }
    	}
    }
    
    private char getWinnerInRows(char[][] field){
        getWinnerInRowsRight(field);
        getWinnerInRowsLeft(field);
        if (CounterOne>=4){
            return field[rowInput][columnInput];
        }
        else
            CounterOne=1;
        return' ';
    }
       
    private char getWinnerInColumns(char[][] field) {
        for (int i = 1; i <=3 ; i++){
            if(rowInput+i < 7){    		
    		if(field[rowInput][columnInput] == field[rowInput+i][columnInput])
                    CounterOne++;
            }
    	}
        if(CounterOne>=4)
            return field[rowInput][columnInput];
        else
            CounterOne=1;
        return ' ';
    }
    
    private void getWinnerinDiagonalsTopLeft(char[][] field){
        for (int i = 1; i <=3 ; i++){
            if(rowInput-i >= 0 && columnInput-i >= 0){    		
    		if(field[rowInput][columnInput] == field[rowInput-i][columnInput-i])
                    CounterOne++;
    		else{
                    return;
    		}
            }
    	}
    }
    
    private void getWinnerinDiagonalsBotRight(char[][] field){
    	for (int i = 1; i <=3 ; i++){
            if(rowInput+i < 7 && columnInput+i < 7){
    		if(field[rowInput][columnInput] == field[rowInput+i][columnInput+i])
                    CounterOne++;
    		else{
                    return;
    		}
            }
    	} 
    }
    
    private void getWinnerinDiagonalsBotLeft(char[][] field){
        for (int i = 1; i <=3 ; i++){
            if(rowInput-i >= 0 && columnInput+i < 7){
    		if(field[rowInput][columnInput] == field[rowInput-i][columnInput+i])
                    CounterTwo++;
                    else{
    			return;
                    }
            }
    	}     	
    }
    
    private void getWinnerinDiagonalsTopRight(char[][] field){
        for (int i = 1; i <=3 ; i++){
            if(rowInput+i < 7 && columnInput-i >= 0){
                if(field[rowInput][columnInput] == field[rowInput+i][columnInput-i])
                    CounterTwo++;
                    else{
                        return;
                    }
            }
        } 	
    }
    
    private char getWinnerInDiagonals(char[][] field) {
    	getWinnerinDiagonalsTopLeft(field);
    	getWinnerinDiagonalsBotRight(field);
        getWinnerinDiagonalsTopRight(field);
        getWinnerinDiagonalsBotLeft(field);
    	
    	if(CounterOne >= 4 || CounterTwo >=4)
    		return field[rowInput][columnInput];
    	else{
    		CounterOne = 1;
                CounterTwo = 1;
    		return ' ';
    	}
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
 
        for (int i = 0; i < field.length; ++i)
            for (int j = 0; j < field[i].length; ++j)
                if (field[i][j] == ' ') 
                    return ' ';
 
        return 'D';
    }
 
}
