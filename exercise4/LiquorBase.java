public abstract class LiquorBase {
	public String description = "none";

	public String getDescription() {
		return description;
	}
	
	public abstract int calories();
}