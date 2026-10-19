import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        
        // Тип long защищает от переполнения при умножении остатков
        System.out.println(1 + (n % m) * (m % n));
    }
}
