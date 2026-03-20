package CodeForcesProblemSet;
import java.util.*;

public class ParkourDesign {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            long x = sc.nextLong();
            long y = sc.nextLong();

            boolean ok;

            if (y >= 0) {
                long rem = x - 2 * y;
                ok = (rem >= 0 && rem % 3 == 0);
            } else {
                long rem = x - 4 * (-y);
                ok = (rem >= 0 && rem % 3 == 0);
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}