public class Lime extends LiquorDecorator {
	public Lime(LiquorBase liquor) {
		this.liquor = liquor;
	}

	public String getDescription() {
		return liquor.getDescription() + "Lime ";
	}

	public int calories() {
		return 2 + liquor.calories();
	}
}