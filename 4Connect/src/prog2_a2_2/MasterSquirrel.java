package prog2_a2_2;

public class MasterSquirrel extends Entity{

	public final static int energy = 1000; 
	public MasterSquirrel(int id, int x, int y) {
		super(id, energy, x, y);
                
	}
	
	// Erstellt ein Minisquirrel
	public void createDescendant(int id, int energy, int x, int y, char Patron){

		
	}
	
	//Pr�fe ob �bergebenes Entity Object ein Nachfahre ist
	public boolean checkDescendant(Object object){
		boolean Descendant = false;
		
		
		return Descendant;
	}
        
        public String getEntity(){
            return "MasterSquirrel";
        }
}

