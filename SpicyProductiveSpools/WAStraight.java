public class WAStraight extends SlotMachine {
  WASlotFactory slotFactory;

  public WAStraight(WASlotFactory slotFactory) {
    this.slotFactory = slotFactory;
  }

  public NJStraight() {
    this.gpu = "ARM";
    this.os = "Linux";
    this.display = "reels";
    this.payment = "bills";
    this.size = "large";
  }

  void makingMachine() {
    System.out.println("Preparing WA Straight Machine");
  }
}