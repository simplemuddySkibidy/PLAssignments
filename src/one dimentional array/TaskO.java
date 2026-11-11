import java.util.ArrayList;
import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int totalDestroyed = 0;
        boolean removed;

        do {
            removed = false;
            int i = 0;
            while (i < list.size()) {
                int j = i;




                // длина текушей непрерывной цепочки сейм цветов
                while (j < list.size() && list.get(j).equals(list.get(i))) {
                    j++;
                }
                int length = j - i;

                if (length >= 3) {
                    for (int k = 0; k < length; k++) {
                        list.remove(i);
                    }
                    totalDestroyed += length;
                    removed = true;
                    break;

                }
                i = j;
            }

        }
        while (removed);

        System.out.println(totalDestroyed);
    }
}