import java.util.Scanner;
    public class TaskE{
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
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (isPrime(a)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
