public class WAStore implements Store {
	public SlotMachine createBonus() {
		System.out.println("Creating Washington Bonus Machine");
		SlotMachineFactory factory = new WASlotFactory("bonus");
		return factory.getslot();
	}

	public SlotMachine createStraight() {
		System.out.println("Creating Washington Straight Machine");
		SlotMachineFactory factory = new WASlotFactory("straight");
		return factory.getslot();
	}

	public SlotMachine createProgressive() {
		System.out.println("Creating Washington Progressive Machine");
		SlotMachineFactory factory = new WASlotFactory("progressive");
		return factory.getslot();
	}
}