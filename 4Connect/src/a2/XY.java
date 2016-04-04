package prog2_a2;
import java.util.Random;

public final class XY {
	

	public int[] move(int[] ActPos, int[] Vector){
            if((ActPos[0]+Vector[0])>=0 && (ActPos[1]+Vector[1])>=0)
                return new int[] {ActPos[0] + Vector[0],ActPos[1] + Vector[1]};
            else if((ActPos[0]+Vector[0])<0 && (ActPos[1]+Vector[1])>=0)
                return new int[] {0,ActPos[1] + Vector[1]};
            else if((ActPos[0]+Vector[0])>=0 && (ActPos[1]+Vector[1])<0)
                return new int[] {ActPos[0]+Vector[0],0};
            else if((ActPos[0]+Vector[0])<0 && (ActPos[1]+Vector[1])<0)
                return new int[] {0,0};
            else
                return ActPos;
	}
        
        public int[] randVect(){
            Random r = new Random();
            return new int[]{r.nextInt(3)-1,r.nextInt(3)-1};
        }
}
