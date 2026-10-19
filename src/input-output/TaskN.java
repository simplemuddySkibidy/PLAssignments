import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = 9 * 60 + n * 45 + (n / 2) * 15 + ((n - 1) / 2) * 5;

        System.out.println(t / 60 + " " + t % 60);
    }
}