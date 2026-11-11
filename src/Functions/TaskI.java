import java.util.Scanner;
    public class TaskI {
        public static boolean isArmstrong(int n){
           int a = n;
           int sum = 0;
           while (n>0){
               int b = n % 10;
               sum +=  b*b*b;
               n /= 10;
           }
           return sum == a;
        }
        public static void main(String[] args){
            for(int i = 100; i <= 999; i++){
                if (isArmstrong(i)){
                    System.out.print(i+" ");
                }
            }
        }

    }
