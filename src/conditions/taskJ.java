import java.util.Scanner;

public class taskJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long cost = a * 100 + b;
        long paid = c * 100 + d;
        long change = paid - cost;

        long e = change / 100;
        long f = change % 100;

        System.out.println(e + " " + f);
    }
}