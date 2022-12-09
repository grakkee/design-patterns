public class NJProgressive extends SlotMachine {
 NJSlotFactory slotFactory;
 public NJProgressive(NJSlotFactory slotFactory) {
   this.slotFactory = slotFactory;
 }
  public NJProgressive() {
   this.gpu = "X86";
   this.os = "Windows XP";
   this.display = "CRT";
   this.payment = "Bills";
   this.size = "Small";
 }
 void makingMachine() {
 System.out.println("Preparing NJ Progressive Machine");
 }
}