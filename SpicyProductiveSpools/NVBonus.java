public class NVBonus extends SlotMachine {
 NVSlotFactory slotFactory;
 public NVBonus(NVSlotFactory slotFactory) {
   this.slotFactory = slotFactory;
 }
 public NVBonus() {
   this.gpu = "X77";
   this.os = "Android";
   this.display = "LCD";
   this.payment = "ticketinticketout";
   this.size = "Medium";
 }
 void makingMachine() {
 System.out.println("Preparing " + name);
 }
}
