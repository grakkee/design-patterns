public class TestRTS { 
  public static void main(String[] args) 
  { 
    GameUnit grunt = new Grunt(); 
    GameUnit tank = new Tank();  
    grunt.move(); 
    tank.move(); 
    grunt.attack(); 
    tank.attack();

    //Grunt picks up a pistol!
    grunt.setAttack(new Attack_Pistol());
    grunt.attack();

    //Tank upgrades to flying!
    tank.setMove(new Move_Fly());
    tank.move();
    
  } 
} 