public class MakeMilkshake implements Command {
	public LineCook s;
	public MakeMilkshake(LineCook s) {
		this.s = s;
	}

	public void Execute() {
		s.makeMilkshake();
	}
}