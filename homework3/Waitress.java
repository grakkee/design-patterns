import java.util.ArrayList;
import java.util.List;

public class Waitress {
	String name;
	private List<Command> commandList = new ArrayList<Command>();

	public Waitress(String name) {
		this.name = name;
		System.out.println("Welcome to the restaurant, my name is " + name + " I will be your waitress for today...");
	}

	public void takeOrder(Command cmnd){
		commandList.add(cmnd);		
   }

   public void orderUp(){
      for (Command cmnd : commandList) {
         cmnd.Execute();
      }
      commandList.clear();
   }
}