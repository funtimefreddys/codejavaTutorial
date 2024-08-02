
public class Ex52 {
    public static int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int result = cube(i);
            System.out.println("The cube of " + i + " is: " + result);
        }
    }
}