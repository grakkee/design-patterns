public class GameUnit { 
  MoveBehavior moveBehavior;
  AttackBehavior attackBehavior;
  
  public void attack(){
    System.out.println(this.getClass().getName())          attackBehavior.attack();
  } 
 
  public void move() { 
    System.out.println(this.getClass().getName()); 
    moveBehavior.move();
  }  
  //Pick up new Weapon function
  public void setAttack(AttackBehavior ab)
  {
    System.out.println(this.getClass().getName() + 
                       " picked up a new weapon!");
    attackBehavior = ab;
  }
  //Upgrade Function
  public void setMove(MoveBehavior mb)
  {
    System.out.println(this.getClass().getName() + 
                       " got an upgrade!");
    moveBehavior = mb;
  }
  
} 