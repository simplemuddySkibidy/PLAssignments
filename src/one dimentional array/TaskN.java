import java.util.Scanner;

public class N {



    // разварачивем массив туда сюда на местепе
    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();


        int d = k % n;
        if (d < 0) {
            d += n;
        }


        if (d > 0) {
            reverse(a, 0, n - d - 1);
            reverse(a, n - d, n - 1);
            reverse(a, 0, n - 1);
        }


        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}