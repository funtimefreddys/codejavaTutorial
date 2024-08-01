public class ExNo2 {
    public static void main(String[] args) {
        System.out.println("The numbers that do not exceed 100 and are divisible by 3 and 5 are as follows :");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}