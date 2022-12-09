public class NVSlotFactory implements SlotMachineFactory {
  public NVSlotFactory(String type) {
      SlotMachine slotmachine = null;
      if(type.equals("straight")) {
        slotmachine = new NVStraight();
      } else if (type.equals("bonus")) {
        slotmachine = new NVBonus();
      } else if (type.equals("progressive")) {
        slotmachine = new NVProgressive();
      } 
      System.out.println("Making a Nevada style " + type + " Slot Machine");
  }    

}
