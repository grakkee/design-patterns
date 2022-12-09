public class LEDs extends TreeDecorator {
	public LEDs(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "some LEDs, ";
	}

	public double cost() {
		return 10.00 + tree.cost();
	}
}