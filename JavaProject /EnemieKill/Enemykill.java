import java.util.*;
public class Enemykill {
  private ArrayList<Integer> enemyLocation= new ArrayList<Integer>();
   private int choice;
   private int leftShoot=5;
   private int numberHit;
   private ArrayList<Integer> choiceList= new ArrayList<Integer>();
   
   Scanner scanner = new Scanner(System.in);

   public int getNumberHit(){
    return numberHit;
}
public int getLeftShoot(){
    return leftShoot;
}
  public void setEnemieLocation(){
   
    int m = (int)(Math.random()*5); // generate a reference number that can't exceed the enemys array : 7 and store all the successive value in enemyLocation
    enemyLocation.add(m);
    enemyLocation.add(m+1);
    enemyLocation.add(m+2);
  }
 
  public void setChoice(){
    
    int choice=0;

    
boolean invalidInput= true;
while(invalidInput){
  try{
    
    System.out.println(" Give the coordinates of the shoot");
    choice=scanner.nextInt();
    invalidInput= false;
    
  }
  catch(Exception e){
    System.out.println(" Error\nGive a correct coordinates for the shoot");
    scanner.nextLine();
  }
  
}
this.choice=choice;

// catch(Exception e) {
//   System.out.println("Error\nGive a correct coordinate for the shoot");
//   scanner.nextLine(); // Scanner-Puffer leeren
//   continue; // Schleife fortsetzen
// }





  }
  public boolean contolChoice(int x){
    
      if(choiceList.contains(x)){
        
       System.out.println("We have already check this position");
       
        return true;
      }
      else{
        choiceList.add(x);
        compareChoice();
        return false;
      }
      
    
   
  }
  public boolean compareChoice(){
    
    
    
     
        if(enemyLocation.contains(choice) ){
            System.out.println(" Bingo");
            enemyLocation.remove((Integer)choice);
           numberHit++;
           leftShoot--;

           return true;
           
        }
        else{
          System.out.println(" Nothing here\nTry aigain"); 
          leftShoot--;
          return false;
        }
    
      
            
  
  }

 public void playGame(){

  setEnemieLocation();
 while (!(enemyLocation.isEmpty()) && leftShoot>0) {
  setChoice();
  contolChoice(choice);
  
 
 }
 
 if(enemyLocation.isEmpty()){
  System.out.println("We have killed all the enemy ");

}
if(leftShoot==0) {
  System.out.println("We don't have Missile anymore my general ");

}

 }

}
