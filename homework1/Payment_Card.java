import java.util.Scanner;

public class Payment_Card implements PaymentBehavior {

	public void pay() {
		Scanner scn = new Scanner(System.in);

		System.out.println("Paying with Card");
		System.out.println("Please enter total in sale.");

		float t = scn.nextFloat();
		System.out.println("Your total is " + t);

		System.out.println("Please enter card number.");
		int n = scn.nextInt();
		System.out.println("Thank you, purchase was successful.");
	}
}