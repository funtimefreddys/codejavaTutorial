import java.util.Scanner;

public class CalToNum {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result = 0;
        boolean valid = true;
        System.out.println("Menu:");
        System.out.println("1. Calculate the sum of two numbers");
        System.out.println("2. Calculate the difference between two numbers");
        System.out.println("3. Calculate the product of two numbers");
        System.out.println("4. Calculate the quotient of two numbers");
        System.out.print("Please choose an option (1-4): ");
        choice = Scanner.nextInt();
        System.out.print("Enter the first number: ");
        num1 = Scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = Scanner.nextDouble();
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                valid = false;
        }
        if (valid) {
            System.out.println("The result is: " + result);
        }
    }
}
