public class BlueBalls extends TreeDecorator {
	public BlueBalls(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "some Blue Balls, ";
	}

	public double cost() {
		return 2.00 + tree.cost();
	}
}