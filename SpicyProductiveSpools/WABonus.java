public class WABonus extends SlotMachine {
 WASlotFactory slotFactory;
 public WABonus(WASlotFactory slotFactory) {
   this.slotFactory = slotFactory;
 }
 public WABonus() {
   this.gpu = "ARM";
   this.os = "Symbian";
   this.display = "UGA";
   this.payment = "ticketinticketout";
   this.size = "Medium";
 }
 void makingMachine() {
 System.out.println("Preparing WA BOnus Machine");
 }
}