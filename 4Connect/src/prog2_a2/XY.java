package prog2_a2;

public final class XY {
	
	private int x;
	private int y;

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
	
	public void setx(int newX){
		this.x = newX;
	}
	
	public void sety(int newY){
		this.y = newY;
	}
}
