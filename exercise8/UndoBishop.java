public class UndoBishop implements Command {
	private Bishop b;

	public UndoBishop(Bishop b) {
		this.b = b;
	}

	public void execute() {
		b.undo("Bishop");
	}
}