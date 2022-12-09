public class NJBonus extends SlotMachine {
 NJSlotFactory slotFactory;
 public NJBonus(NJSlotFactory slotFactory) {
   this.slotFactory = slotFactory;
 }
 public NJBonus() {
   this.gpu = "ARM";
   this.os = "Windows ME";
   this.display = "reels";
   this.payment = "coins";
   this.size = "large";
 }
 void makingMachine() {
 System.out.println("Preparing NJ Bonus");
 }
}