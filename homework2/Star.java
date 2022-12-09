public class Star extends TreeDecorator {
	public Star(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "a Star, ";
	}

	public double cost() {
		return 4.00 + tree.cost();
	}
}