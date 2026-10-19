import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();
        int d = scanner.nextInt();

        int a = 0;

        while (x > 0) {
            long b = x % 10;

            if (b == d) {
                a++;
            }

            x = x / 10;
        }

        System.out.println(a);
    }
}