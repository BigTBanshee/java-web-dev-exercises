package exercises.lsn1datatypes;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();
        System.out.println("How many gallons have you consumed?");
        gallons = input.nextDouble();
        input.close();

        milesPerGallon = miles / gallons;



        System.out.println("Your miles per gallon is: " + milesPerGallon);
    }
}
