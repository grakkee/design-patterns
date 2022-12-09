public class AdvancedMonitor extends Monitor {
	public AdvancedMonitor(Subject baby) {
		this.babyData = baby;
		babyData.registerObserver(this);
	}

	displayData = "baby crying: " + isCrying + "crying level: " + cryingType;
	
}