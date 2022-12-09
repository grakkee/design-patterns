public class Kiosk extends ShavedIce {

	public Kiosk() {
    	orderBehavior = new Order_Ticket();
    	paymentBehavior = new Payment_Cash();
	}
}