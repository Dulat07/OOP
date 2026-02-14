package problem2;

public class Cartest {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", EngineType.PETROL, "123ABC");
        Car car2 = new Car("Tesla", EngineType.ELECTRIC, "456XYZ");

        car1.drive();
        car2.drive(120);

        System.out.println("Total cars: " + Car.getTotalCars());
        System.out.println("VIN of car2: " + car2.getVin());
    }
}