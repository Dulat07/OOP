package problem3;

public class TemperatureTest {

    public static void main(String[] args) {

        Temperature t = new Temperature(100, 'C');

        System.out.println("Celsius: " + t.getCelsius());
        System.out.println("Fahrenheit: " + t.getFahrenheit());
    }
}
