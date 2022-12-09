public class SimpleMonitor extends Monitor {
	public SimpleMonitor(Subject baby) {
		this.babyData = baby;
		babyData.registerObserver(this);
	}

	displayData = "baby crying: " + isCrying;
}