public class UndoQueen implements Command {
	private Queen q;

	public UndoQueen(Queen q) {
		this.q = q;
	}

	public void execute() {
		q.undo("Queen");
	}
}