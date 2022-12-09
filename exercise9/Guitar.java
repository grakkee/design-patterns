public class Guitar implements GuitarController {
	public Guitar() {
		System.out.println("Guitar Created");
	}
	public void PressFretButton(colors button) {
		System.out.println("Pressing " + button);
	}
 	public void PressPick() {
 		System.out.println("Pressing the Pick");
 	} 
 	public void PressTremelo() {
 		System.out.println("Pressing the Tremelo");
 	}
}