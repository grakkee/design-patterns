//Amber Hankins & Grace Meredith
//Exercise 6: Abstract Factory Method
//27 September 2022

class Main {
  public static void main(String[] args) {
    Store nv = new NVStore();
    Store nj = new NJStore();
    Store wa = new WAStore();

    SlotMachine njB = nj.createBonus();
    SlotMachine nvB = nv.createBonus();
    SlotMachine waB = wa.createBonus();

    SlotMachine njP = nj.createProgressive();
    SlotMachine nvP = nv.createProgressive();
    SlotMachine waP = wa.createProgressive();

    SlotMachine njS = nj.createStraight();
    SlotMachine nvS = nv.createStraight();
    SlotMachine waS = wa.createStraight();

  }
}
