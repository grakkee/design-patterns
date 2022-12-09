//Grace Meredith & James Looney
//CS330 Exercise 10: Composite
//15 November 2022

public class Player {
	public static void main(String[] args) {

		Primitive primComponent = new Composite("Bag");

		Primitive c = new Cylinder("cylinder", 3.2, 4.5);
		Primitive b = new Box("box", 3.2, 4.8, 8.4);
		Primitive s = new Sphere("Sphere", 5.3);

		primComponent.add(c);
		primComponent.add(b);
		primComponent.add(s);

		double cVol = c.computeVolume();
		double bVol = b.computeVolume();
		double sVol = s.computeVolume();

		System.out.println("Volumes of listed objects: ");
		System.out.println(cVol);
		System.out.println(bVol);
		System.out.println(sVol);

		primComponent.remove(c);
		primComponent.remove(b);
		primComponent.remove(s);
	}
}