package prog2_a2_2;

import java.util.Random;

public class MiniSquirrel extends Entity{
	public char patron;

	public MiniSquirrel(int id, int energy, int x, int y, char patron) {
            super(id, energy, x, y);
            this.patron = patron;
	}

        public void nextStep(){
            move(loc.randVect());
        }
        
        public String getEntity(){
            return "MiniSquirrel";
        }
}
