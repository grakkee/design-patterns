public class LimeJuice extends LiquorDecorator {
	public LimeJuice(LiquorBase liquor) {
		this.liquor = liquor;
	}

	public String getDescription() {
		return liquor.getDescription() + "Lime Juice ";
	}

	public int calories() {
		return 8 + liquor.calories();
	}
}