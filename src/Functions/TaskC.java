import java.util.Scanner;
public class TaskC {
    public static void printInvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInvertedPyramid(n);
    }
}
