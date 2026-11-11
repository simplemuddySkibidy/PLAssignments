import java.util.Scanner;

    public class TaskF {
        public static boolean isPrime(int n){
            if(n<=1){
            return false;
            }

            for(int i=2; i<n; i++){
            if (n % i == 0){
                return false;
                }

            }
            return true;
        }
        public static void counter(int A, int B){
            int count=0;
            for(int i=A; i<=B; i++){
            if(isPrime(i)){
                count++;
                }
            }
            System.out.println("Prime Count = "+count);
        }
            public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            counter(a,b);
        }
    }
