package RIkkei;

public class Car {
    private String Name;

    private String Engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.Name = name;
        this.Engine = engine;
        numberOfCars++;
    }
    public String getName(){
        return  Name;
    }
    public  void setName(){
        this.Name = Name;
    }
    public String getEngine(){
        return Engine;
    }
    public  void  setEngine(){
        this.Engine = Engine;
    }

}
