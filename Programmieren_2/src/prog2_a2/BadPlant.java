package prog2_a2;

public class BadPlant extends Entity{
	public final static int energy = -100; 

	public BadPlant(int id, int x, int y) {
		super(id, energy, x, y);
		// TODO Auto-generated constructor stub
	}

    @Override
    public void nextStep() {
    }
        

}
