import java.util.Scanner;

public class TaskH {
    public static void decimalToBinary(int n){
        if(n==0){
            System.out.println(0);
        }
        String binary = "";
        while(n>0){
            int a = n % 2;
            n = n / 2;
            binary = a + binary;
        }
        System.out.println("Binary = "+binary);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        decimalToBinary(b);
    }
}
