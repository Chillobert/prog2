package prog2_a3;


public class GoodBeast extends Entity{

	public final static int energy = 200; 	
	
	public GoodBeast(int id, int x, int y) {
		super(id, energy, x, y);
	}
//test test test
        @Override
        public void nextStep(){
            this.randMove();
        }
}
