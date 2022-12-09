public class Store extends ShavedIce {

	public Store() {
    	orderBehavior = new Order_Computer();
    	paymentBehavior = new Payment_Card();
	}
}