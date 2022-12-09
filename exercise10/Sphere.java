public class Sphere extends Primitive {
	String name;
	double r;
	public Sphere(String name, double r) {
		this.name = name;
		this.r = r;
		System.out.println("a Sphere called " + name + " was created");
	}

	public String getName() {
		return name;
	}

	//4/3 * pi * r^3
	public double computeVolume() {
		return (1.33) * 3.14 * r * r *r;
	}
}