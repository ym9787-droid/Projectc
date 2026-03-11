import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter base in cm: ");
        float base = sc.nextFloat();

        System.out.print("Enter height in cm: ");
        float height = sc.nextFloat();

        // Area in square centimeters
        float area_cm = 0.5f * base * height;

        // Convert to square inches
        float area_in = area_cm / (2.54f * 2.54f);

        // Output
        System.out.println("The Area of the triangle in sq in is " + area_in +
                           " and sq cm is " + area_cm);

        sc.close();
    }
}