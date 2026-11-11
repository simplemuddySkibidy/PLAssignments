import java.util.Scanner;

public class TaskJ {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("GCD = "+gcd(g, h));
    }
}