public class NJSlotFactory implements SlotMachineFactory {
  public NJSlotFactory(String type) {
      SlotMachine slotmachine = null;
      if(type.equals("straight")) {
        slotmachine = new NJStraight();
      } else if (type.equals("bonus")) {
        slotmachine = new NJBonus();
      } else if (type.equals("progressive")) {
        slotmachine = new NJProgressive();
      } 
      System.out.println("Making a New Jersey style " + type + " Slot Machine");
  }    

}