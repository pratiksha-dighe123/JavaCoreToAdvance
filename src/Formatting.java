import java.util.*;

public class Formatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int num = sc.nextInt();

            // Formatting output
            System.out.printf("%-15s%03d\n", str, num);
        }

        System.out.println("================================");
    }
}