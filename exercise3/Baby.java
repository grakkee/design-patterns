import java.util.ArrayList;

public class Baby implements Subject {
	private ArrayList observers;
	private boolean isCrying;
	private int cryingLevel;

	public Baby() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >=0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		
		for (int i=0; i< observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(isCrying, cryingLevel);
		}
	}

	public void setCrying(boolean isCrying, int cryingLevel) {
		this.isCrying = isCrying;
		this.cryingLevel = cryingLevel;
		System.out.println("setCrying " + isCrying + cryingLevel);
		detectCrying();
	}

	public void detectCrying() {
		System.out.println("Detect Crying is called");
		notifyObservers();
	}
}