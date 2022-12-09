import java.util.Scanner;

public class Payment_Cash implements PaymentBehavior {

	public void pay() {
		Scanner scn = new Scanner(System.in);
		float x = 0;

		System.out.println("Paying with cash");
		System.out.println("Please enter total in sale");
		float t = scn.nextFloat();

		System.out.println("Total is " + t);
		System.out.println("Please enter amount given");

		do {
			x = scn.nextFloat();
			if(x < t) {
				System.out.println("Your total is $5.00, please enter a higher amount");
			}
		}

		while(x < t);

		System.out.println("Thank you! your change is " + (x - t));
	}
}