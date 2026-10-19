import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean f = false;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == 0) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}