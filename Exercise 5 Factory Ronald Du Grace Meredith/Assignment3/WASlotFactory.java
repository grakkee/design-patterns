public class WASlotFactory implements SlotMachineFactory {
  SlotMachine slotmachine;
  public SlotMachine makingMachine(String type) {
      SlotMachine slotmachine = null;

      return slotmachine;
    }
  public WASlotFactory(String type) {

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
      return new mediumCabinet();
    }
    else {
      return new largeCabinet();
    }
  }
  public Display createDisplay(String type) {
    if(type.equals("bonus")) {
      return new Reels();
    }
    else {
      return new VGA();
    }
  }
  public OS createOS(String type) {
    if(type.equals("straight")) {
      return new Linux();
    }
    else if(type.equals("bonus")) {
      return new Symbian();
    }

    else {
      return new Android();
    }
  }
  public Payment createPayment(String type) {
    if(type.equals("progressive")) {
      return new Coins();
    }
    else if(type.equals("bonus")) {
      return new TicketinTicketout();
    }
    else {
      return new Bills();
    }
  }
  public GPU createGPU(String type) {
      return new ARM();
  }   

  public SlotMachine getslot() {
    return this.slotmachine;
  }

}
