package prog2_a2;

import java.io.ObjectInputStream.GetField;

public class Launcher {

	public static void main(String[] args){
		Entity fred = new Entity(1, 10, 1, 0);
		BadBeast meixner = new BadBeast(2, 2, 4);
		
		MasterSquirrel master = new MasterSquirrel(3, 4, 4);
		MiniSquirrel mini = new MiniSquirrel(4, 50, 5, 4, master.getId());
		
		System.out.println(master.checkDescendant(mini.getId()));
		
		System.out.println("ID:" + (fred.getId()));
		System.out.println("Energy:" + (fred.getEnergy()));
		System.out.println(fred.loc);
		fred.loc.setx(2);
		System.out.println(fred.loc.getx());
		System.out.println(fred.loc);
		System.out.println(meixner.energy);
	}
}
