import java.util.Random;

public class Customer {
	String name;

	public Customer(String name) {
		this.name = name;
		System.out.println(name + " has arrived to the restaurant.");
	}

	public String createOrder() {
		//Generate a random order from options to simulate a customer
		String[] options={"Milkshake", "Burger"};
		Random order = new Random();
		int num = order.nextInt(options.length);

		System.out.println(name + " wants to order a " + options[num]);

		return options[num];
	}
}