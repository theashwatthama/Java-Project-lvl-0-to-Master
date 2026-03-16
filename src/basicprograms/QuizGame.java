package basicprograms;

import java.util.Scanner;

public class QuizGame {
    static void main() {
      String[] questions = {"What is the main function of router ? ",
              "Which part of a computer is considered as the brain ? ",
              "In which year the facebook launched ? ",
              "Who is known as the father of computer ? ",
             };

      String[][] options = {{"1.Storing Files ","2. Encrypting Data","3. Directing internet Traffic","4.Managing Passwords"}
              ,{"1. CPU ","2. Hard Drive","3. GPU","4. Ram"}
              ,{"1. 2000 ","2. 2004","3. 2006","4. 2008"}
              ,{"1. Steve Jobs","2. Bill Gates","3. Alan Turning ","4. Charls Babbage"}};

      int [] answers ={3,1,2,4};
      int score = 0;
      int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println(" Welcome to the Quiz Game");
        System.out.println("***************************");

        for (int i = 0; i < questions.length ; i++) {
            System.out.println(questions[i]);

            for(String option :options[i]) {
                System.out.println(option);
            }
            System.out.print("Choose the correct option : ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

        }
        System.out.println("You Scored "+score +" out of "+questions.length);

    }
}
