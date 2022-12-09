public class SilverBalls extends TreeDecorator {
	public SilverBalls(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "some Silver Balls, ";
	}

	public double cost() {
		return 3.00 + tree.cost();
	}
}