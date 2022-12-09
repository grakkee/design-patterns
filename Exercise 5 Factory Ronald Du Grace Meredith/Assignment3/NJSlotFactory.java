public class NJSlotFactory implements SlotMachineFactory {
  SlotMachine slotmachine;
  public SlotMachine makingMachine(String type) {
      SlotMachine slotmachine = null;

      return slotmachine;
    }

  public NJSlotFactory(String type) {

    if(type.equals("progressive")) {
      slotmachine = new Progressive();
    }
    else if(type.equals("straight")) {
      slotmachine = new Straight();
    }

    else {
      slotmachine = new Bonus();
    }

    slotmachine.cab = createCabinet(type);
    slotmachine.disp = createDisplay(type);
    slotmachine.payment = createPayment(type);
    slotmachine.gpu = createGPU(type);
    slotmachine.os = createOS(type);
  }
  public Cabinet createCabinet(String type) {
    if(type.equals("straight") || type.equals("progressive")) {
      return new smallCabinet();
    }

    else {
      return new largeCabinet();
    }
  }
  public Display createDisplay(String type) {
    if(type.equals("bonus")) {
      return new Reels();
    }
    else if(type.equals("progressive")) {
      return new CRT();
    }
    else {
      return new LCD();
    }
  }
  public OS createOS(String type) {
    if(type.equals("progressive")) {
      return new WindowsXP();
    }

    else {
      return new WindowsME();
    }
  }
  public Payment createPayment(String type) {
    if(type.equals("straight") || type.equals("bonus")) {
      return new Coins();
    }
    else {
      return new Bills();
    }
  }
  public GPU createGPU(String type) {
    if(type.equals("straight") || type.equals("bonus")) {
      return new ARM();
    }
    else {
      return new X86();
    }
  } 

  public SlotMachine getslot() {
    return this.slotmachine;
  }

}
