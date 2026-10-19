import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            int a = sc.nextInt();
            s+=a;
        }
        System.out.println(s);
    }
}