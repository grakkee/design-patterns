class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    SlotMachineFactory ex = new NVSlotFactory("progressive");
    
  }

  public static void display(SlotMachineFactory ex, String type) {
    System.out.println("--- Making a " + type + " Slot Machine ---");
    System.out.println("fetching components: " + ex.slotmachine.cabinet + ", " + ex.slotmachine.display + ", " + ex.slotmachine.gpu + ", " + ex.slotmachine.payment + ", " + ex.slotmachine.os);
  }
}