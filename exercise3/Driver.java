//Grace Meredith & Ray Heinzelman 
//CS 330 Exercise 3: Observer Pattern
//Due 13 September 2022

public class Driver {
	
	public static void main(String[] args) {
		Monitor monA = new AdvancedMonitor();
		Monitor monS = new SimpleMonitor();
		Baby baby1 = new Baby();

		baby1.setCrying(true, 0);
		monA.display();
		monS.display();
	}
}