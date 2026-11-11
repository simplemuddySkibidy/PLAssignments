import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int max = a[0];


        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(max);
    }
}