package prog2_a2_2;
public class BadBeast extends Entity{
	
public final static int energy = -150;

	public BadBeast(int id, int x, int y) {
		super(id, energy, x, y);
                
	}
        
        public void nextStep(){
            move(loc.randVect());
        }
        
        public String getEntity(){
            return "BadBeast";
        }
}
