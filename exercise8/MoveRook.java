public class MoveRook implements Command {
	private Rook r;

	public MoveRook(Rook r) {
		this.r = r;
	}

	public void execute() {
		r.move();
	}
}