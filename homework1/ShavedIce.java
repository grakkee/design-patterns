public class ShavedIce {
	OrderBehavior orderBehavior;
	PaymentBehavior paymentBehavior;

	public void order() {
    	orderBehavior.order();
  	} 
 
  	public void pay() { 
    	paymentBehavior.pay();
  	}  
  	
  	public void setOrder(OrderBehavior od) {
    	orderBehavior = od;
  	}
  	
  	public void setPayment(PaymentBehavior pm) {
    	paymentBehavior = pm;
  	}

}