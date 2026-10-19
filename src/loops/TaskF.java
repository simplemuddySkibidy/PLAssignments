import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long r = 0;
        while (x > 0) {
            r = r* 10 + (x % 10);
            x /= 10;
        }
        System.out.println(r);
    }
}