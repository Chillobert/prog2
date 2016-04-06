package prog2_a3;

import java.util.Arrays;

public class Board {
	
private int length;
private int width;
private int amountGoodBeasts;
private int amountBadBeasts;
private int amountGoodPlants;
private int amountBadPlants;
private int amountWalls;
private String[][] board;

	
    public Board(){
	BoardConfig config = new BoardConfig();
	this.length = config.getLength();
	this.width = config.getWidth();
	this.amountGoodBeasts = config.getAmountGoodBeasts();
	this.amountBadBeasts = config.getAmountBadBeasts();
	this.amountGoodPlants = config.getAmountGoodPlants();
	this.amountBadPlants = config.getAmountBadPlants();
	this.board = new String[config.getLength()][config.getWidth()];
	fillBoard(2,3,2,2,2);
	};
	
    private void fillBoard(int amountGoodBeasts, int amountBadBeasts, int amountGoodPlants, int amountBadplants, int amountWalls){
	//testzwecke

	};
	
@Override
    public String toString(){
    		//Möchte er bestimmt selbst geschrieben haben
    	return (Arrays.deepToString(board) + "\n");
    }

    public int getEntityCount() {
		int amount = 0;
		return amount;
		
	}
	
}
