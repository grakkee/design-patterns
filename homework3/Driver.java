//Grace Meredith
//CS330 HW3: Command Pattern
//Due: 31 October 2022

public class Driver {
	public static void main(String[] args) {
		Customer c1 = new Customer("John");
		Customer c2 = new Customer("Karen");
		Waitress w = new Waitress("Hannah");
		LineCook l = new LineCook();

		String[] orders = {c1.createOrder(), c2.createOrder()};

		for(int i = 0; i < orders.length; i++) {
			if(orders[i].equals("Milkshake")) {
				MakeMilkshake m = new MakeMilkshake(l);
				w.takeOrder(m);
			}
			else {
				MakeBurger b = new MakeBurger(l);
				w.takeOrder(b);
			}
		}

		w.orderUp();
   }
}