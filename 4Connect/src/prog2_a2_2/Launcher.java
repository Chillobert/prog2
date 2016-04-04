package prog2_a2_2;

public class Launcher {

	public static void main(String[] args){
		MasterSquirrel fred = new MasterSquirrel(1, 1, 2);
                MiniSquirrel karl = new MiniSquirrel(3,100,3,4,'a');
                GuidedMasterSquirrel toni = new GuidedMasterSquirrel(1,2,3);
                fred.updateEnergy(-100);
		BadBeast meixner = new BadBeast(1, 2, 4);
                System.out.println("X:"+fred.getPos()[0]);
		fred.move(new int[]{1,5});
                karl.nextStep();
                meixner.nextStep();
		System.out.println(meixner.energy);
                System.out.println(fred.toString());
                System.out.println(karl.toString());
                System.out.println(meixner.toString());
	}
}
