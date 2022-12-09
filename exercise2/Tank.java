public class Tank extends GameUnit { 
  public Tank(){ 
    System.out.println("new Tank"); 
    attackBehavior = new Attack_Cannon();
    moveBehavior = new Move_Drive();
  } 
  


} 