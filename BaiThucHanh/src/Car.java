public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String n, String e){
        this.name = n;
        this.engine = e;
        numberOfCars++;
    }
}

