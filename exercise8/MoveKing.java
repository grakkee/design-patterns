public class MoveKing implements Command {
	private King k;

	public MoveKing(King k) {
		this.k = k;
	}

	public void execute() {
		k.move();
	}
}