import java.util.Scanner;
public class TaskD {
    public static void printMatrix(int n, int m){
        int count = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(count);
                if(j<m-1) {
                    System.out.print(" ");
                }
                count++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printMatrix(a,b);

    }
}
