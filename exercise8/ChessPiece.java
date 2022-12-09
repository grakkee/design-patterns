//All Chess Pieces represent receivers of the commands given.

public abstract class ChessPiece {
	//initialize location coordinate at A0 with acsii char literals, for easy coordinate manipulation
	Location currentLoc = new Location('A', '0');
	Location prevLoc = new Location('A', '0');

	//abstract because every piece has a different move algorithm
	abstract void move();

	//final void because undo is the same for all chess pieces
	final void undo(String Name) {
		this.currentLoc.x = this.prevLoc.x;
		this.currentLoc.y = this.prevLoc.y;
		System.out.println(Name + " Undo play " + this.currentLoc.x + this.currentLoc.y);
	}
}