public class Cylinder extends Primitive {
	String name;
	double r;
	double h;
	
	public Cylinder(String name, double r, double h) {
		this.name = name;
		this.r = r;
		this.h = h;
		System.out.println("a Cylinder called " + name + " was created");
	}

	public String getName() {
		return name;
	}

	//pi * r^2 * h
	public double computeVolume() {
		return 3.14 * (r * r) * h;
	}

}