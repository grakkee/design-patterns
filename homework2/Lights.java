public class Lights extends TreeDecorator {
	public Lights(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "some Lights, ";
	}

	public double cost() {
		return 5.00 + tree.cost();
	}
}