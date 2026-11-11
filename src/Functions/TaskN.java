import java.util.Scanner;

public class TaskN {
    public static void transformDigits(int n){
        String c = "";
        while(n>0){
            int a = n % 10;
            if(a % 2 == 0){
                a++;
            }
            else{
                a--;
            }
            c = a + c;
            n /= 10;
        }
        System.out.println(c);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        transformDigits(b);
    }
}