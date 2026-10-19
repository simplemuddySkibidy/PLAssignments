import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();
        int a = 0;

        while (x > 0) {
            long b = x % 10;
            int b1 = (int)b;
            a = a + b1;


            x = x / 10;
        }

        System.out.println(a);
    }
}