package prog2_a2;

public class Launcher {

	public static void main(String[] args){
            Boolean play=true;
            /*
		MasterSquirrel fred = new MasterSquirrel(1, 1, 2);
                MiniSquirrel karl = new MiniSquirrel(3,100,3,4,'a');
                GuidedMasterSquirrel toni = new GuidedMasterSquirrel(2,2,3);
                fred.updateEnergy(-100);
		BadBeast jack = new BadBeast(1, 2, 4);
                System.out.println("X:"+fred.getPos()[0]);
		fred.move(new int[]{1,5});
                karl.nextStep();
                jack.nextStep();
		System.out.println(jack.energy);
                System.out.println(fred.toString());
                System.out.println(karl.toString());
                System.out.println(jack.toString());
                EntitySet ent = new EntitySet();
                ent.add("BadPlant",0,1,2);
                System.out.println(ent.outputString());*/
            
                EntitySet ent = new EntitySet();

            while(play){
                ent.add("BadBeast", 0, 1, 2);
                ent.add("GoodBeast" ,1,2,3);
                ent.add("GoodPlant",2,3,4);
                ent.add("BadPlant",3,4,5);
                ent.add("GuidedMasterSquirrel",4,5,6);
                ent.add("Wall", 5, 6, 7);
                System.out.println(ent.toString());
                ent.nextStepAll();
                System.out.println(ent.toString());
                ent.delete(3);
                System.out.println(ent.toString());
                play=false;
            }
	}
}
