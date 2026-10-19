import java.util.Scanner;

public class taskF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if ((k % n == 0 && k / n < m) || (k % m == 0 && k / m < n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}