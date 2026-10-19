
import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((h - b - 1) / (a - b) + 1);
    }
}
