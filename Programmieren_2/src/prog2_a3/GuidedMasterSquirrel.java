package prog2_a3;

import java.util.Scanner;

public class GuidedMasterSquirrel extends MasterSquirrel {
    
    public GuidedMasterSquirrel(int id, int x, int y){
        super(id,x,y);
    }
    
    public void moveSquirrel(){
        Scanner input = new Scanner(System.in);
        String in;
        int[] Vector = new int[]{0,0};
        System.out.println("Wählen Sie eine Bewegungsrichtung für ihr Eichhörnchen: ");
        in = input.next();
        switch(in){
            case "a":Vector[0]=-1;break;
            case "s":Vector[1]=1;break;
            case "d":Vector[0]=1;break;
            case "w":Vector[1]=-1;break;
            case "q":Vector[0]=-1;Vector[1]=-1;break;
            case "e":Vector[0]=1;Vector[1]=-1;break;
            case "c":Vector[0]=1;Vector[1]=1;break;
            case "y":Vector[0]=-1;Vector[1]=1;break;
            default: System.out.println("Keine gültige Richtung");break;
        }
            loc.move(Vector);
    }
    
}
