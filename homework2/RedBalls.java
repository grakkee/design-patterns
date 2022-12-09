public class RedBalls extends TreeDecorator {
	public RedBalls(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "some Red Balls, ";
	}

	public double cost() {
		return 1.00 + tree.cost();
	}
}