//Grace Meredith
//CS330 HW2 Decorating a Tree
//Due: 16 September 2022

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		intro();

		Tree tree = selectTreeType();
		displayCurrentTotalCost(tree.cost());

		selectDecorations(tree);
		outro();
	}

	public static void intro() {
		System.out.println("Merry Christmas!! Welcome to the Tree Shop! Let me know what you like.");
	}

	public static Tree selectTreeType(){
		String type;
		Scanner scn = new Scanner(System.in);

		displayTreeOptions();

		do {
			type = scn.nextLine();
			if(!validTree(type)) {
				System.out.println("Sorry! We don't have that type available. Please enter a code from our list provided.");
			}
		}
		while(!validTree(type));

		return getTreeType(type);
	}

	public static void selectDecorations(Tree tree) {
		String dec;
		Scanner scn = new Scanner(System.in);
		Boolean hasStar = false;

		do{
			displayDecorationOptions();
			dec = scn.nextLine();
			if(!validDecorator(dec)) {
				System.out.println("Sorry! We don't have that type available. Please enter a cod from our list provided or 'e' to exit.");
			}

			else if(dec.equals("s") && hasStar) {
				System.out.println("Sorry! Only one star per Christmas Tree. Please enter a different decoration or 'e' to exit.");
			}

			else if(!dec.equals("e") && !dec.equals("exit")) {
				tree = getDecoratorType(tree, dec);
				displayCurrentDescription(tree.getDescription());
				displayCurrentTotalCost(tree.cost());

				if(dec.equals("s")) {
					hasStar = true;
				}
			}
		}

		while(!dec.equals("e") && !dec.equals("exit"));
	}

	public static void displayCurrentDescription(String description) {
		System.out.println("Current tree so far: " + description);
	}

	public static void displayCurrentTotalCost(double cost) {
		System.out.println("Total Cost: " + cost + "\n");
	}

	public static void displayTreeOptions() {
		System.out.println("Select the type of Tree you want to purchase." + "\n");
		System.out.println("TYPE " + "| " + "COST" + "| " + "CODE");
		System.out.println("------------------------------------------------------");
		System.out.println("Balsam Fir " + "| " + "$5.00" + "| " + "bf");
		System.out.println("Fraser Fir " + "| " + "$12.00" + "| " + "ff");
		System.out.println("Douglas Fir " + "| " + "$15.00" + "| " + "df");
		System.out.println("Colorado Blue Spruce " + "| " + "$20.00" + "| " + "cb" + "\n");
		System.out.println("Enter the code of your choice.");
	}

	public static void displayDecorationOptions() {
		System.out.println("Select the Decorations you want to add." + "\n");
		System.out.println("TYPE " + "| " + "COST" + "| " + "CODE");
		System.out.println("-----------------------------------------------");
		System.out.println("Star " + "| " + "$4.00" + "| " + "s");
		System.out.println("Ruffles " + "| " + "$1.00" + "| " + "rf");
		System.out.println("Ribbons " + "| " + "$2.00" + "| " + "rbb");
		System.out.println("Red Balls " + "| " + "$1.00" + "| " + "rb");
		System.out.println("Blue Balls " + "| " + "$2.00" + "| " + "bb");
		System.out.println("Silver Balls " + "| " + "$3.00" + "| " + "sb");
		System.out.println("Lights " + "| " + "$5.00" + "| " + "l");
		System.out.println("LEDs " + "| " + "$10.00" + "| " + "led" + "\n");

		System.out.println("Enter 'e' or 'exit' to save and finish." + "\n");


	}

	public static void outro() {
		System.out.println("Thank You for shopping with us!");
	}

	public static Tree getTreeType(String type) {
		if(type.equals("bf")) {
			return new BalsamFir();
		}

		else if(type.equals("ff")) {
			return new FraserFir();
		}

		else if(type.equals("df")) {
			return new DouglasFir();
		}

		else {
			return new ColoradoBlueSpruce();
		}
	}

	public static Tree getDecoratorType(Tree tree, String dec) {
		if(dec.equals("s")) {
			return new Star(tree);
		}

		else if(dec.equals("rf")) {
			return new Ruffles(tree);
		}

		else if(dec.equals("rbb")) {
			return new Ribbons(tree);
		}

		else if(dec.equals("rb")) {
			return new RedBalls(tree);
		}

		else if(dec.equals("bb")) {
			return new BlueBalls(tree);
		}

		else if(dec.equals("sb")) {
			return new SilverBalls(tree);
		}

		else if(dec.equals("l")) {
			return new Lights(tree);
		}

		else {
			return new LEDs(tree);
		}
	}

	public static Boolean validTree(String type) {
		return type.equals("bf") || type.equals("ff") || type.equals("df") || type.equals("cb");
	}

	public static Boolean validDecorator(String dec) {
		return dec.equals("s") || dec.equals("rf") || dec.equals("rbb") || dec.equals("rb") || dec.equals("bb") || dec.equals("sb") || dec.equals("l") || dec.equals("led") || dec.equals("e") || dec.equals("exit");
	}
}