import java.util.Scanner;

public class taskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (r1 == r2 || c1 == c2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}