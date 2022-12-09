public class Ruffles extends TreeDecorator {
	public Ruffles(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "some Ruffles, ";
	}

	public double cost() {
		return 1.00 + tree.cost();
	}
}