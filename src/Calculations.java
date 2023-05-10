import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int numb2 = Integer.valueOf(scanner.nextLine());

        // 1. Addition
        int addition = num1 + numb2;
        System.out.println(num1 + " + " + numb2 + " = " + addition);

        // 2. Subtraction
        int subtraction = num1 - numb2;
        System.out.println(num1 + " - " + numb2 + " = " + subtraction);

        // 3. Multiplication
        int multiplication = num1 * numb2;
        System.out.println(num1 + " * " + numb2 + " = " + multiplication);

        // 4. Division
        double division = (double) num1 / numb2;
        System.out.println(num1 + " / " + numb2 + " = " + division);

        // 6. Modulus
        int modulus = num1 % numb2;
        System.out.println(num1 + " % " + numb2 + " = " + modulus);

    }
}
