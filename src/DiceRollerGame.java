import java.util.Random;
import java.util.Scanner;

public class DiceRollerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter no. of dice to be rolled :");
        int dice = sc.nextInt();
        int total = 0;

        if (dice >0){
            for (int i = 0; i < dice; i++) {
                int roll = rand.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled : "+roll);
                total += roll;
            }
            System.out.println("Total : "+total);
        } else {
            System.out.println("Invalid ! no. of dice can't be 0 or -ve. ");
        }

    }
    static void printDie(int roll){
        String Dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
             """;
        String Dice2 = """
                -------
               | ●     |
               |       |
               |      ●|
                -------
             """;
        String Dice3 = """
                -------
               |●      |
               |   ●   |
               |      ●|
                -------
             """;
        String Dice4 = """
                -------
               |●     ●|
               |       |
               |●     ●|
                -------
             """;
        String Dice5 = """
                -------
               |●     ●|
               |   ●   |
               |●     ●|
                -------
              """;
        String Dice6 = """
                -------
               |●     ●|
               |●     ●|
               |●     ●|
                -------
             """;

        switch (roll){
            case 1 -> System.out.println(Dice1);
            case 2 -> System.out.println(Dice2);
            case 3 -> System.out.println(Dice3);
            case 4 -> System.out.println(Dice4);
            case 5 -> System.out.println(Dice5);
            case 6 -> System.out.println(Dice6);
            default -> System.out.println("Invalid No.");
        }
    }
}
