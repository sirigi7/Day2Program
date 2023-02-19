import java.util.Scanner;

public class NumberPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number (1, 10, 100, or 1000): ");
        int num = scanner.nextInt();

        int thousands = num / 1000;
        int hundreds = (num % 1000) / 100;
        int tens = (num % 100) / 10;
        int units = num % 10;

        System.out.println("Thousands: " + thousands);
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Units: " + units);

        scanner.close();
    }
}
