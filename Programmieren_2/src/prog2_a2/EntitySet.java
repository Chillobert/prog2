package prog2_a2;

import java.util.Arrays;

public class EntitySet {

    int numbOf=0;
    Entity[] entArray = new Entity[50];
    int[] delArray = new int[50];
    int idColl=0;
    
    public EntitySet(){   
        Arrays.fill(delArray, ' ');
    }
    
    public void add(String entityTyp,int id, int x, int y){
        switch(entityTyp){
            case"BadPlant": entArray[numbOf++] = new BadPlant(id,x,y);break;
            case"GoodBeast":entArray[numbOf++] = new GoodBeast(id,x,y);break;
            case"GoodPlant":entArray[numbOf++] = new GoodPlant(id,x,y);break;
            case"BadBeast":entArray[numbOf++] = new BadBeast(id,x,y);break;
            case"GuidedMasterSquirrel":entArray[numbOf++] = new GuidedMasterSquirrel(id,x,y);break;
            case"Wall":entArray[numbOf++] = new Wall(id,x,y);break;
        }
    }
    
    public void delete(int id){
        Entity[] copyArray = new Entity[50];
        int j=0;
        for(int i=0;entArray[i] != null;i++){
            if(!(entArray[i].getId() == id)){
                copyArray[j] = entArray[i];
                j++;
                //Da immer nur eine ID �bergeben, wird es nie mehr als einen Eintrag weniger geben
            }
            /* for(int k=0;k<copyArray.length;k++){
                if(entArray[k]!=null)
                entArray[k]=copyArray[k];} */
        }
        
        Arrays.fill(entArray, null); //Array leeren !
        for (int k = 0; copyArray[k]!=null; k++){ //Array mit neuen Werten f�llen
        	entArray[k] = copyArray[k];
        }
        
        
        numbOf--;
    }
    
    public int getLatestId(){
        return numbOf;
    }
    
    @Override
    public String toString(){
        String output="";
        for(int i=0;entArray[i]!=null;i++){
            output += entArray[i].toString() + '\n';
        }
        return(output);
    }

    public void nextStepAll(){
        for(int i=0;entArray[i]!=null;i++){
            entArray[i].nextStep();
             checkCollision(i);
        }
        
        //Nach Rundendurchlauf wird mit jeder ID(siehe mortalCombat) die in delArray gespeichert wurde die Delete Methode aufgerufen
        for(int j = 0;delArray[j] != ' '; j++){
        	delete(delArray[j]);
        	
        }
        
        //Nach delete wird delArray geleert
        Arrays.fill(delArray, ' ');
    }

    private void checkCollision(int arrayPos){
        for(int i=0;entArray[i]!=null;i++){
            if((entArray[arrayPos].loc.getX()==entArray[i].loc.getX()&(entArray[arrayPos].loc.getY()==entArray[i].loc.getY()))){
                mortalCombat(arrayPos,i);
                return;
            }
        }
    }
    
    public boolean isInstance(Object o, Class c){
    	
    return c.isInstance(o);

    }
    
    //equals methode(mit instanceof)?
    private void mortalCombat(int arrayPos,int collPos){
    	if(isInstance(entArray[arrayPos],PlayerEntity.class)){
    		if(isInstance(entArray[collPos], GoodPlant.class)){
    			entArray[arrayPos].updateEnergy(entArray[collPos].getEnergy());
    			entArray[collPos].updateEnergy(entArray[collPos].getEnergy()); //Energie auf 0 setzen
    			
    			for(int i = 0; i < delArray.length; i++){ //- Id an CollPos wird in delArray gespeichert
    				if(delArray[i] == ' '){
    					delArray[i] = entArray[collPos].getId(); //-
    					return;
    				}
    			}
    		}
    	}
    		
       /* if(entArray[ArrayPos] instanceof PlayerEntity){
            if(entArray[CollPos] instanceof GoodPlant){
                entArray[ArrayPos].updateEnergy(entArray[CollPos].getEnergy());
                //gelöschte Elemente als Int[] und nach der schleife in check delete aufrufen mit allen Elementen
                //und bei Update energy das element des Verlierers auf 0 setzen
            }
      }
      */ 
    }
}