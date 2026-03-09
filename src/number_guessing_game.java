import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // NUMBER GUESSING GAME

        int guess;
        int attempts = 0;
        int randomnum = rand.nextInt(1,101);

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100 ");
        do {
            System.out.print("Enter a guess : ");
            guess = sc.nextInt();
            attempts++;

            if (guess > randomnum) {
                System.out.println("The number you entered is greater than the OG Number ");
            } else if (guess < randomnum) {
                System.out.println("The number you entered is less than the OG Number ");
            } else  {
                System.out.println("you guessed the correct number : " +guess);
                System.out.println("Number of attempts you took : "+attempts);
            }
        } while (guess != randomnum);
        sc.close();
    }
}
