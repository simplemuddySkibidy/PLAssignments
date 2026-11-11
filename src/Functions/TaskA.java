import java.util.Scanner;
    public class TaskA{
        public static void printStrip(int a, char b){
            for(int i = 1; i<=a; i++){
                System.out.print(b);
            }
        }


        public static void main(String[] args){
            Scanner a = new Scanner(System.in);
            int n = a.nextInt();
            printStrip(n,'#');
        }
    }