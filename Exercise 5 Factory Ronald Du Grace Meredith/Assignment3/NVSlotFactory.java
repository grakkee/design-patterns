public class NVSlotFactory implements SlotMachineFactory {
  SlotMachine slotmachine;
  public SlotMachine makingMachine(String type) {
      SlotMachine slotmachine = null;

      return slotmachine;
    }
  public NVSlotFactory(String type) {

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
    if(type.equals("bonus")) {
      return new smallCabinet();
    }

    else if(type.equals("progressive")) {
      return new mediumCabinet();
    }
    else {
      return new largeCabinet();
    }
  }
  public Display createDisplay(String type) {
    if(type.equals("straight")) {
      return new Reels();
    }
    else if(type.equals("bonus")) {
      return new CRT();
    }
    else {
      return new LCD();
    }
  }
  public OS createOS(String type) {
    if(type.equals("straight") || type.equals("bonus")){
      return new Linux();
    }

    else {
      return new Android();
    }
  }
  public Payment createPayment(String type) {
    return new TicketinTicketout();
  }

  public GPU createGPU(String type) {
    if(type.equals("straight")) {
      return new ARM();
    }
    else if(type.equals("progressive")) {
      return new X77();
    }
    else {
      return new X86();
    }
  }   

  public SlotMachine getslot() {
    return this.slotmachine;
  }

}
