import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i]= scanner.nextInt();
        }

        for(int i=0; i<n/2; i++) {
            int temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        for(int i=0; i<n; i++) {
            System.out.print(a[i]+(i==n-1 ? "" : " ")); //sapce
        }
        System.out.println();
    }
}
