// Ex5-3.java
import java.util.Scanner;

public class Ex53 {

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int max = findMax(num1, num2);
        
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
        
        scanner.close();
    }
}