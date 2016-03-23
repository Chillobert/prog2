package prog2_a2;

public class Entity {
	
	public int id;
	public int energy;
	public XY loc;
	public int x;
	public int y;
	
//Constructor
public Entity(int id, int energy, int x, int y){
	loc = new XY(x, y); //Immutable Object wird generiert
	this.id = id;
	this.energy = energy;
	this.x = x;
	this.y = y;
	
};


public int getId(){
	return id;
}

public int getEnergy(){
	return energy;
}
	
public void updateEnergy(int charge){
	energy = energy + charge;
}



}
