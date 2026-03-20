package CodeForcesProblemSet;
import java.util.*;
public class Watermelon {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of Watermelon : ");
        int n = sc.nextInt();

        if (n%2==0 && n>2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
