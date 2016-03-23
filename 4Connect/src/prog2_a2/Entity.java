package prog2_a2;

public class Entity{
	
	public int id;
	public int energy;
	public XY loc;
	
//Constructor
public Entity(int id, int energy, int x, int y){
	loc = new XY(x, y); //Immutable Object wird generiert
	this.id = id;
	this.energy = energy;
	
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
