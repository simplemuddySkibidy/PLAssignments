import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }


        int l1 = a - 1;
        int r1 = b - 1;
        while (l1 < r1) {
            int temp = arr[l1];
            arr[l1] = arr[r1];
            arr[r1] = temp;
            l1++;
            r1--;
        }





        int l2 = c - 1;
        int r2 = d - 1;
        while (l2 < r2) {
            int temp = arr[l2];
            arr[l2] = arr[r2];
            arr[r2] = temp;
            l2++;
            r2--;
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
    }
}