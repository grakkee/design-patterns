//Grace Meredith & Jarod Gobert
//CS330 Exercise 4: Decorator Pattern
//Due 20 Sepetmber 2022

public class Driver {
	
	public static void main(String[] args) {

		System.out.println("Welcome to Sterling Cooper. Let me make some drinks for your party");

		LiquorBase oldFashion = makeOldfashion();
		LiquorBase vodkaGimlet = makeVodkaGimlet();
		LiquorBase manhattan = makeManhattan();
		LiquorBase tomCollins = makeTomCollins();

		System.out.println("Old Fashion: " + oldFashion.getDescription() + "calories: " + oldFashion.calories());
		System.out.println("Vodka Gimlet: " + vodkaGimlet.getDescription() + "calories: " + vodkaGimlet.calories());
		System.out.println("Manhattan: " + manhattan.getDescription() + "calories: " + manhattan.calories());
		System.out.println("Tom Collins: " + tomCollins.getDescription() + "calories: " + tomCollins.calories());

	}

	public static LiquorBase makeOldfashion(){
		LiquorBase oldFashion =  new Bourbon();
		oldFashion = new Bitters(oldFashion);
		oldFashion = new Bitters(oldFashion);
		oldFashion = new Lime(oldFashion);
		oldFashion = new Cherry(oldFashion);

		return oldFashion;
	}

	public static LiquorBase makeVodkaGimlet(){
		LiquorBase vodkaGimlet = new Vodka();
		vodkaGimlet = new LimeJuice(vodkaGimlet);
		vodkaGimlet = new Lime(vodkaGimlet);

		return vodkaGimlet;
	}

	public static LiquorBase makeManhattan() {
		LiquorBase manhattan = new Bourbon();
		manhattan = new Vermouth(manhattan);
		manhattan = new Vermouth(manhattan);
		manhattan = new Cherry(manhattan);
		manhattan = new Bitters(manhattan);

		return manhattan;
	}

	public static LiquorBase makeTomCollins() {
		LiquorBase tomCollins = new Gin();
		tomCollins = new LimeJuice(tomCollins);
		tomCollins = new LimeJuice(tomCollins);
		tomCollins = new Sugar(tomCollins);
		tomCollins = new Sugar(tomCollins);
		tomCollins = new Lime(tomCollins);

		return tomCollins;
	}
}