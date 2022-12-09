public class MakeBurger implements Command {
	public LineCook s;
	public MakeBurger(LineCook s) {
		this.s = s;
	}

	public void Execute() {
		s.makeBurger();
	}
}