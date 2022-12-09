import java.util.Scanner;

public class Order_Ticket implements OrderBehavior {

	public void order() {
		Scanner scn = new Scanner(System.in);

		System.out.println("ordering with a ticket");
		System.out.println("Please enter the order number");

		int orderNumber = scn.nextInt();
		System.out.println("Order Number: " + orderNumber);
	}
}