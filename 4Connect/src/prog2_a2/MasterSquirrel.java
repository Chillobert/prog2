package prog2_a2;

public class MasterSquirrel extends Entity{

	public final static int energy = 1000; 

	public MasterSquirrel(int id, int x, int y) {
		super(id, energy, x, y);
		// TODO Auto-generated constructor stub
	}
	
	// Erstellt ein Minisquirrel
	public void createDescendant(int id, int energy, int x, int y, char patron){

		
	}
	
	//Prüfe ob übergebenes Entity Object ein Nachfahre ist
	//Klassenmitgliedschaft ermitteln, über ID des erbenden Objekts ?
	public boolean checkDescendant(int id){
		boolean Descendant = false;
		
		
		return Descendant;
	}
}
