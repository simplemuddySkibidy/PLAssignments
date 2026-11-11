import java.util.Scanner;
public class TaskB {
    public static void print(int a){
        for(int i=1; i<=a; i++){
            System.out.print('*');
        }
        System.out.println();
    }
    public static void prints(int a){
        System.out.print('*');
        for(int i=1; i<=a-2; i++){
            System.out.print(' ');
        }
        System.out.println('*');
    }
    public static void printHollowSquare(int a){
        print(a);
        for(int i = 1; i<=a-2; i++ ){
            prints(a);
        }
        print(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHollowSquare(n);
    }


}
