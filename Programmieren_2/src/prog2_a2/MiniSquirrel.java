package prog2_a2;

public class MiniSquirrel extends Entity{
	public int patronId;

	public MiniSquirrel(int id, int energy, int x, int y, int patronId) {
            super(id, energy, x, y);
            this.patronId = patronId;
	}

        @Override
        public void nextStep(){
            loc.move(loc.randVect());
        }
        
}
