public class ExNo3 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("The multiplication table of the mother " + n + " is as follows:");
        for (int i = 1; i <= 12; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}