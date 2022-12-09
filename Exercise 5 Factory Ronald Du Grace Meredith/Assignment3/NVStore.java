public class NVStore implements Store {
	public SlotMachine createBonus() {
		System.out.println("Creating Nevada Bonus Machine");
		SlotMachineFactory factory = new NVSlotFactory("bonus");
		return factory.getslot();
	}

	public SlotMachine createStraight() {
		System.out.println("Creating Nevada Straight Machine");
		SlotMachineFactory factory = new NVSlotFactory("straight");
		return factory.getslot();
	}

	public SlotMachine createProgressive() {
		System.out.println("Creating Nevada Progressive Machine");
		SlotMachineFactory factory = new NVSlotFactory("progressive");
		return factory.getslot();
	}
}