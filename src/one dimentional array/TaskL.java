import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }


        int petya = scanner.nextInt();

        // По умолчанию, если Петя самы низкий, онвстает в самыйконец
        int position = n + 1;


        for (int i = 0; i < n; i++) {
            if (a[i] < petya) {
                position = i + 1;
                break;
            }
        }
        System.out.println(position);
    }
}
