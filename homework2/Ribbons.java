public class Ribbons extends TreeDecorator {
	public Ribbons(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "some Ribbons, ";
	}

	public double cost() {
		return 2.00 + tree.cost();
	}
}