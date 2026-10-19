import java.util.Scanner;

public class taskL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLong()) return;
        long k = sc.nextLong();
        long m = sc.nextLong();
        long n = sc.nextLong();

        long totalTime;

        if (n == 0) {
            totalTime = 0;
        } else if (n <= k) {

            totalTime = 2 * m;
        } else {

            long totalSides = 2 * n;

            long batches = (totalSides + k - 1) / k;

            totalTime = batches * m;
        }

        System.out.println(totalTime);
    }
}