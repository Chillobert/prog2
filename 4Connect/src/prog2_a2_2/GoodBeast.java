package prog2_a2_2;

import java.util.Random;

public class GoodBeast extends Entity{

	public final static int energy = 200; 	
	
	public GoodBeast(int id, int x, int y) {
		super(id, energy, x, y);
	}

        public void nextStep(){
            Random r = new Random();
            move(loc.randVect());
        }
        
        public String getEntity(){
            return "GoodBeast";
        }
}
