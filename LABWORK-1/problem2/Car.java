package problem2;

enum EngineType {
    DIESEL,
    PETROL,
    ELECTRIC
}

public class Car {

    private String brand;
    private EngineType engine;

    private final String vin;
    private static int totalCars;

    public Car(String brand, EngineType engine, String vin) {
        this.brand = brand;
        this.engine = engine;
        this.vin = vin;
        totalCars++;
    }

    public void drive() {
        System.out.println("Car is driving...");
    }

    public void drive(int speed) {
        System.out.println("Car is driving at " + speed + " km/h");
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public String getVin() {
        return vin;
    }
}