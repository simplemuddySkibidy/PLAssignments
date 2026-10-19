import java.util.Scanner;

public class taskM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();


        if ((long) x1 * x2 > 0 && (long) y1 * y2 > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}