package prog2_a2_2;

public class Entity{
	
	public int id;
	public int energy;
	public XY loc;
        public int[] pos = new int[2];
	
//Constructor
public Entity(int id, int energy, int x, int y){
	this.pos[0]=x;
        this.pos[1]=y;
	this.id = id;
	this.energy = energy;
	this.loc = new XY();
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

public void move(int[] Vector){
    this.pos=loc.move(this.pos,Vector);
}

public int[] getPos(){
    return (new int[]{this.pos[0],this.pos[1]});
}

        @Override
        public String toString(){
            return ("id:"+id+", energy:"+energy+", X:"+this.pos[0]+", Y:"+this.pos[1]);
        }

}
