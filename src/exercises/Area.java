package exercises.lsn1datatypes;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double length;
        double width;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = input.nextDouble();
        System.out.println("Enter the width: ");
        width = input.nextDouble();
        input.close();

        area = length * width;


        System.out.println("The area is: " + area);
    }
}