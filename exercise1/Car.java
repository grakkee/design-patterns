public class Car extends Vehicle{
    private Wheel carTires;
    private Engine carEngine;
    private String model;
    static void Car() 
    { 
        System.out.println("Car Constructor Called");
        this.setType("Car");
        System.out.println(getType());
    }; 

    public int getNumWheels(){
        return carTires.quantity;
    };
    public String getModel(){
        return model;
    };

    public void setNumWheels(int val){
        setQuantity(val);
    };
    public void setModel(String val){
        this.model = val;
    };

    public void pushAccelerator(){};


};
