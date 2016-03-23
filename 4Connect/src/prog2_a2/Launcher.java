package prog2_a2;

import java.io.ObjectInputStream.GetField;

public class Launcher {

	public static void main(String[] args){
		Entity fred = new Entity(1, 10, 0, 0);
		System.out.println("ID:" + (fred.getId()));
		System.out.println("Energy:" + (fred.getEnergy()));

	}
}
