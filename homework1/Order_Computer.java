import java.util.Random;

public class Order_Computer implements OrderBehavior {

	public void order() {
		Random rand = new Random();
		int orderNumber = rand.nextInt(1000);

		System.out.println("ordering with the computer");
		System.out.println("Your order number is " + orderNumber);
	}
}