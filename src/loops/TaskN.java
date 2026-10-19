import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int s = 0;
        int v = 0;
        int g = 0;
        for (int i = 1; i <= b; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                s += 1;
            } else if (a > 0) {
                v += 1;
            }
            else{
                g += 1;
            }
        }
        System.out.print(s + " " + v + " " + g + " ");
    }
}