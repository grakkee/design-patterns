public class NJStraight extends SlotMachine {
  NJSlotFactory slotFactory;

  public NJStraight(NJSlotFactory slotFactory) {
    this.slotFactory = slotFactory;
  }

  public NJStraight() {
    this.gpu = "ARM";
    this.os = "Windows ME";
    this.display = "LCD";
    this.payment = "coins";
    this.size = "small";
  }

  void makingMachine() {
    System.out.println("Preparing NJ Straight Machine");
  }
}
