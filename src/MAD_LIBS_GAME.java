import java.util.Scanner;
public class MAD_LIBS_GAME {
    public static void main(String[] args) {
            // MAD LIBS GAME
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an adjective (description) : ");
        String adjective1 = sc.nextLine();
        System.out.print("Enter a noun (person or animal) : " );
        String noun = sc.nextLine();
        System.out.print("Enter an adjective (description) : ");
        String adjective2 = sc.nextLine();
        System.out.print("Enter a verb (action) ending with -ing : ");
        String verb = sc.nextLine();
        System.out.print("Enter an adjective (description) : ");
        String adjective3 = sc.nextLine();

        System.out.println("Yesterday we went to a "+adjective1+" game zone.");
        System.out.println("At there we saw a creepy "+noun+", he was barking there.");
        System.out.println(noun+" was "+adjective2+" and "+ verb);
        System.out.println("I was "+adjective3);
        sc.close();
    }
}
