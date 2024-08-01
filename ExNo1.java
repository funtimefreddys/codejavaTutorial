public class ExNo1 {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        System.out.println("The even integers in the range from " + start + " to " + end + " are as follows:");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}