import java.util.Scanner;
    public class TaskG {
        public static void factorial(int n){
            int a = 1;
            for(int i=1; i<=n; i++){
                a = a * i;
            }
            System.out.println("Factorial = "+a);
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            factorial(b);
        }
    }

