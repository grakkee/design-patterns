public interface SlotMachineFactory {
  public SlotMachine makingMachine(String type);
  public Cabinet createCabinet(String type);
  public Display createDisplay(String type);
  public OS createOS(String type);
  public Payment createPayment(String type);
  public GPU createGPU(String type); 
  public SlotMachine getslot(); 
}
