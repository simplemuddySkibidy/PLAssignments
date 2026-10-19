
import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int total = (a * 100 + b) * n;

        System.out.println(total / 100 + " " + total % 100);
    }
}