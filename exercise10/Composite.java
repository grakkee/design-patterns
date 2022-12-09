import java.util.ArrayList;

public class Composite extends Primitive {
	ArrayList objectComponents = new ArrayList();
	String name;
	
	public Composite(String name) {
		this.name = name;
		System.out.println("A container called " + name + " was created");
	}

	public String getName() {
		return name;
	}
	
	public void add(Primitive p) {
		objectComponents.add(p);
		System.out.println("Object " + p.getName() + " added");
	}
	
	public void remove(Primitive p) {
		objectComponents.remove(p);
		System.out.println("Object " + p.getName() + " removed");
	}

	public Primitive getChild(int i) {
		return (Primitive)objectComponents.get(i);
	}
}