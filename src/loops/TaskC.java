import java.util.Scanner;
public class TaskC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++){
            if (i < 0) continue;

            int w = (int) Math.sqrt(i);

            if (w * w == i) {
                System.out.print(i + " ");
            }
        }
    }
}
