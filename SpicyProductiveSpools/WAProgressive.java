public class WAProgressive extends SlotMachine {
 WASlotFactory slotFactory;
 public WaProgressive(WaSlotFactory slotFactory) {
   this.slotFactory = slotFactory;
 }
  public WAProgressive() {
   this.gpu = "X86";
   this.os = "Linux";
   this.display = "CRT";
   this.payment = "ticketinticketout";
   this.size = "Small";
 }
 void makingMachine() {
 System.out.println("Preparing " + name);
 }
}