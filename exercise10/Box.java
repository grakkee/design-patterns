public class Box extends Primitive {
	String name;
	double l;
	double w;
	double h;
	public Box(String name, double l, double w, double h) {
		this.name = name;
		this.l = l;
		this.w = w;
		this.h = h;
		System.out.println("a Box called " + name + " was created");
	}

	public String getName() {
		return name;
	}

	//length * width * height
	public double computeVolume() {
		return l * w * h;
	}
}