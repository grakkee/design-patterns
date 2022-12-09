public class Dance implements DanceController {
	public Dance() {
		System.out.println("Dance created");
	}
	public void Step(direction dir) {
		System.out.println("Pressing " + dir);
	}
}