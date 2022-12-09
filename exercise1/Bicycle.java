public class Bicycle extends Vehicle {
    private Wheel bikeTires;
    private Chain bikeChain;
    private String type;
    static void Bicycle() 
    { 
        System.out.println("Bicycle Constructor Called");
        this.setType("Bicycle");
        System.out.println(this.getType());
    }; 
    public int getNumWheels(){
        return bikeTires.getquantity;
    };
 
    public String getType(){
        return type;
    };

    public void setNumWheels(int val){
        setQuantity(val);
    };
  
    public void setType(String val){
        this.type = val;
    };
    public void pushPedels(){

    };
};