import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take Celsius input
        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();

        // Convert to Fahrenheit
        float farenheitResult = (celsius * 9/5) + 32;

        // Print result
        System.out.println("Temperature in Fahrenheit is: " + farenheitResult);

        sc.close();
    }
}