import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = 0;


        for (long i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                if (i * i == a) {
                    b += 1;
                } else {
                    b += 2;
                }
            }
        }

        System.out.println(b);
    }
}