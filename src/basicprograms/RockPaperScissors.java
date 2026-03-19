package basicprograms;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random no = new Random();

        String[] choices ={"rock","paper","scissor"};
        String playerChoice;
        String compChoice;
        String playAgain="yes";

        do {
            System.out.print("Enter your Choice : ");
            playerChoice= sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock")&&(!playerChoice.equals("paper")&&(!playerChoice.equals("scissor")))){
                System.out.println("Invalid Choice");
                continue;
            }

            compChoice = choices[no.nextInt(0,3)];
            System.out.println("Computer Choice : "+compChoice);

            if (playerChoice.equals(compChoice)) {
                System.out.println("It's a tie ");
            } else if (playerChoice.equals("rock") && compChoice.equals("scissor") || playerChoice.equals("paper") && compChoice.equals("rock") || (playerChoice.equals("scissor")&&(compChoice.equals("paper")))) {
                System.out.println("You win ");
            }else {
                System.out.println("You Lose");
            }

            System.out.println("Play Again (Yes/No)");
            playAgain= sc.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

    }
}
