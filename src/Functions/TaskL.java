import java.util.Scanner;

public class TaskL {
    public static void reverseNumber(int n){
        String reverse = "";
        while(n>0){
            int a = n % 10;
            n = n / 10;
            reverse = reverse + a;
        }
        System.out.println(reverse);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        reverseNumber(b);
    }
}
