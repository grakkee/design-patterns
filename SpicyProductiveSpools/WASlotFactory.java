public class WASlotFactory implements SlotMachineFactory {
  public WASlotFactory(String type) {
      SlotMachine slotmachine = null;
      if(type.equals("straight")) {
        slotmachine = new WAStraight();
      } else if (type.equals("bonus")) {
        slotmachine = new WABonus();
      } else if (type.equals("progressive")) {
        slotmachine = new WAProgressive();
      } 
      System.out.println("Making a Washington style " + type + " Slot Machine");
  }    

}