import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        if(n>1) {
            int lastN= a[n-1];

            for(int i=n-1; i>0; i--) {
                a[i]=a[i-1];
            }
            a[0]=lastN;
        }
        for (int i=0; i<n; i++) {
            System.out.print(a[i]+(i==n-1 ? "" : " "));
        }
        System.out.println();
    }
}