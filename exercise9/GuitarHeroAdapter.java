public class GuitarHeroAdapter implements DanceController, GuitarController {
	private Guitar g;
	private Dance d;	

	public GuitarHeroAdapter(Guitar g) {
		System.out.println("Dance adapter created");
		this.g = g;
	}

	public GuitarHeroAdapter(Dance d) {
		System.out.println("Guitar adapter created");
		this.d = d;
	}

	public void Step(direction dir) {
		colors c = convertColor(dir);
		g.PressFretButton(c);
	}

	public void PressFretButton(colors button) {
		direction dir = convertDirection(button);
		d.Step(dir);
	}
 	public void PressPick() {
 		System.out.println("Pressing the Pick");
 	}
 	public void PressTremelo() {
 		System.out.println("Pressing the Tremelo");
 	}

 	public direction convertDirection(colors c) {
 		direction dir = direction.FORWARD;

 		switch(c) {
 			case GREEN:
 				dir = direction.FORWARD;
 				break;
 			case RED:
 				dir = direction.LEFT;
 				break;
 			case YELLOW:
 				dir = direction.RIGHT;
 				break;
 			case BLUE:
 				dir = direction.BACK;
 				break;
 			case ORANGE:
 				dir = direction.MIDDLE;
 				break;
 		}

 		return dir;
 	}

 	public colors convertColor(direction dir) {
 		colors c = colors.RED;

 		switch(dir) {
 			case FORWARD:
 				c = colors.GREEN;
 				break;
 			case LEFT:
 				c = colors.RED;
 				break;
 			case RIGHT:
 				c = colors.YELLOW;
 				break;
 			case BACK:
 				c = colors.BLUE;
 				break;
 			case MIDDLE:
 				c = colors.ORANGE;
 				break;
 		}

 		return c;
 	}
}