public class MovePawn implements Command {
	private Pawn p;

	public MovePawn(Pawn p) {
		this.p = p;
	}

	public void execute() {
		p.move();
	}
}