import java.util.Scanner;

public class taskI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0 || b * c == a * d) {
            System.out.println("NO");
        } else if (-b % a == 0) {
            long x = -b / a;
            System.out.println(x);
        } else {
            System.out.println("NO");
        }
    }
}
