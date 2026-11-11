import java.util.Scanner;

public class TaskK {
    public static void lcm(int a, int b) {
        int m;
        if (a > b) {
            m = a;
        } else {
            m = b;
        }
        while (m % a != 0 || m % b != 0) {
            m++;
        }

        System.out.println("LCM = "+m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        lcm(c, d);
    }
}
