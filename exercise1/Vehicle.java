public class Vehicle{
    private String color;
    private String type;
    private String owner;

    static void Vehicle(){
        System.out.println("Vehicle Constructor Called");
        this.setColor("default");
        this.setType("default");
        System.out.println(getColor());
        System.out.println(getType());
    };

    public String getType() {
        return type;
    };

    public String getOwner() {
        return owner;
    };

    public String getColor(){
        return color;
    };

    public void setType(String val) {
        this.type = val;
    };

    public void setOwner(String val) {
        this.owner = val;
    };

    public void setColor(String val){
        this.color = val;
    };

    public void pushBrake(){};
};