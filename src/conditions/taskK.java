import java.util.Scanner;

public class taskK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        if (k >= 8 || k == 3 || k == 5 || k == 6) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}