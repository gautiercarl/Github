
import java.util.*;
public class GessGameCopy{
    public static void main (String arg[]){
      
      StartGame Start = new StartGame();  
      Start.Gess();
       
    }
  
}

 class StartGame{
  public void Gess(){
    System.out.println("wellcome to the Gess Game");
    

    Players players = new Players();
    players.setNbPlayers();
    players.setName();

    int number= (int) (Math.random() * 10);
  System.out.println("Now you have to Gess a number between 0 and 9");

    players.PlayerChoice();
    players.Compare(number);
    
  }

}
/**
 * create Players and inizialise name
 */
 class Players {
  Scanner Scanner= new Scanner(System.in);
String name;
int choice;
 int nbPlayer;
Players[] ListPlayers;

public String getName(){
  return name;
}
public int getNbPlayers(){
  return nbPlayer;
}
public int getChoice(){
  return choice;
}

public void setNbPlayers(){
  System.out.println("How many Players?");
  int nb= Scanner.nextInt();
  while(nb<=0){
    System.out.println("error!!");
    System.out.println("How many Players?");
  nb= Scanner.nextInt();

}
if(nb>0){
  nbPlayer=nb;
  ListPlayers= new Players[nbPlayer];
  for (int i=0;i<nbPlayer; i++){
    ListPlayers[i]= new Players();
  }
}
}

public void setName(){

  for (int i=0;i<nbPlayer; i++) {
    
    System.out.println("Player "+ (i+1) +" Select a Pseudo:");
    String pseudo=Scanner.nextLine();
    while(pseudo.isEmpty()== true){
      System.out.println("error!!");
      System.out.println("Player "+ (i+1) +" Select a Pseudo:");
    pseudo=Scanner.nextLine();
    
    }
    if(pseudo.isEmpty()== false){
      ListPlayers[i].name=pseudo;
      System.out.println("Hi " +  ListPlayers[i].name);
    }
    
    
   } 
}

public void setChoice(){

  
}

public void newPlayer(){
  
  
 

  

}

public void PlayerChoice(){
  for (int i=0;i<nbPlayer; i++) {
    
    System.out.println(ListPlayers[i].name+ " your selection:");

   ListPlayers[i].choice = Integer.parseInt(Scanner.nextLine());
   
  
   
   }
   

}

public void Compare(int number){
  for (int i=0;i<nbPlayer; i++) {
    
    if(ListPlayers[i].choice== number){
      System.out.println(ListPlayers[i].name +"  was Right");
    }
    else{
      System.out.println(ListPlayers[i].name +"  was false");
     

    }
   
   }
   System.out.println(" The result was "+ number); 
}
}

