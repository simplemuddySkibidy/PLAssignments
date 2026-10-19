import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= b; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                s += 1;
            }
        }
        System.out.print(s);
    }
}