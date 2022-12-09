public class NVStraight extends SlotMachine {
 NVSlotFactory slotFactory;

 public NVStraight(NVSlotFactory slotFactory) {
   this.slotFactory = slotFactory;
 }
 public NVStraight() {
   this.gpu = "ARM";
   this.os = "Linux";
   this.display = "Reels";
   this.payment = "ticketinticketout";
   this.size = "Large";
 }
 void makingMachine() {
 System.out.println("Preparing NV Straight Machine");
 }
}
