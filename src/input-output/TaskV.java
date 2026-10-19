import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        
        long diff = a - b;
        long shift = diff + 1000;
        long sign = shift / 1000;
        
        long isZero = 1 - ((diff * diff + 999999) / 1000000);
        long finalSign = sign * (1 - isZero) + isZero;
        
        long max = a * finalSign + b * (1 - finalSign);
        
        System.out.println(max);
    }
}
