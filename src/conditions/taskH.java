import java.util.Scanner;

public class taskH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if (-b % a == 0) {
                System.out.println(-b / a);
            } else {
                System.out.println("NO");
            }
        }
    }
}