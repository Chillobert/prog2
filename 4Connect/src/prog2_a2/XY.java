package prog2_a2;

public final class XY {
	public int x;
	public int y;
	
//Constructor
	public XY(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public int getx(){
		return x;
	}
	
	public int gety(){
		return y;
	}
	
	public int changeX(int newX){
		
		return x + newX;
	}

	
	public int changeY(int newY){
		
		return y + newY;
	}
}

