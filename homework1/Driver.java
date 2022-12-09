//Grace Meredith
//CS330 Homework Assignment 1
//Strategy Pattern

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) { 
    	ShavedIce loc = getLocation();
    	loc.order();
    	loc.pay();
  } 

  	//get location of shaved ice shop
 	public static ShavedIce getLocation() {
 		Scanner scn = new Scanner(System.in);
 		String l;

 		System.out.println("Hi there. Welcome to shaved ice! Please tell me which location you are at.");

 		do {
 			System.out.println("Enter 's' for store or 'k' for kiosk");
 			l = scn.nextLine();
 		}

 		while(!l.equals("s") && !l.equals("k"));

 		if(l.equals("s")) {
 			ShavedIce s = new Store();
 			setPayType(s);
 			return s;
 		} 

 		else {
 			return new Kiosk();
 		}
 	}

 	//if location is store, choose to pay with cash or card. card is default paytype.
 	public static void setPayType(ShavedIce s) {
 		Scanner scn = new Scanner(System.in);
 		String p;

 		System.out.println("Will you be paying with cash or card?");

 		do {
 			System.out.println("Enter 'card' or 'cash'.");
 			p = scn.nextLine();
 		}

 		while(!p.equals("cash") && !p.equals("card"));

 		if(p.equals("cash")) {
 			s.setPayment(new Payment_Cash());
 		}
 	}
}