public class NVProgressive extends SlotMachine {
 NVSlotFactory slotFactory;
 public NVProgressive(NVSlotFactory slotFactory) {
   this.slotFactory = slotFactory;
 }
  public NVProgressive() {
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
