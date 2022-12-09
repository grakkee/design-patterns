public class Monitor implements Observer {
	String cryingType;
	boolean isCrying;
	Subject babyData;
	String displayData;

	public Monitor(Subject baby) {
		this.babyData = baby;
		babyData.registerObserver(this);
	}

	public void update(boolean isCrying, int cryingLevel) {
		this.isCrying = isCrying;
		switch(cryingLevel) {
			case 0:
				this.cryingType = "Sobbing";
				break;
			case 1:
				this.cryingType = "Crying";
				break;
			case 2:
				this.cryingType = "Screaming";
				break;
			default: 
				this.cryingLevel = "None";
		}
	}

	public void loseInterest() {
		babyData.removeObserver(this);
		System.out.println("Observer was removed");
	}

	public void display() {
		System.out.println(displayData);
	}
	
}