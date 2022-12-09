public class Grunt extends GameUnit { 
  
  public Grunt(){ 
    System.out.println("new Grunt"); 
    attackBehavior = new Attack_Axe();
    moveBehavior = new Move_Walk();
  } 
  
} 