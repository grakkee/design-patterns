public class NJStore implements Store {
	public SlotMachine createBonus() {
		System.out.println("Creating New Jersey Bonus Machine");
		SlotMachineFactory factory = new NJSlotFactory("bonus");
		return factory.getslot();
	}

	public SlotMachine createStraight() {
		System.out.println("Creating New Jersey Straight Machine");
		SlotMachineFactory factory = new NJSlotFactory("straight");
		return factory.getslot();
	}
	public SlotMachine createProgressive() {
		System.out.println("Creating New Jersey Progressive Machine.");
		SlotMachineFactory factory = new NJSlotFactory("progressive");
		return factory.getslot();
	}
}