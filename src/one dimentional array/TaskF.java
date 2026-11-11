import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int count = 0;

        for(int i=0; i<n; i++) {
            a[i]= scanner.nextInt();
        }

        //have two neihbrgr
        for(int i=1; i<n-1; i++) {
            if (a[i]>a[i-1] && a[i]>a[i+1]) { //leftt and rifght
                count++;
            }
        }
        System.out.println(count);
    }
}
