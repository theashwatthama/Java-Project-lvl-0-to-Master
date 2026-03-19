package basicprograms;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[]row;
        String PlayAgain;
        System.out.println("***************************");
        System.out.println("   Welcome To Java Slots ");
        System.out.println("  Slots : 🍕 🍔 🍟 🌭 🍿");
        System.out.println("***************************");

        while (balance>0){
            System.out.println("Current Balance : $"+balance);
            System.out.print("Place your bet : ");
            bet = sc.nextInt();
            sc.nextLine();
            if (bet>balance){
                System.out.println("Insufficient Balance");
                continue;
            } else if (bet<0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance-=bet;
            }

            System.out.println("Spinning .....");
            row =spinrow();
            printRow(row);
           payout= getpayout(row,bet);
           if (payout>0){
               System.out.println("You Won : $"+payout);
               balance+=payout;
           } else {
               System.out.println("sorry you lost this round");
           }
            System.out.print("Do you want to play again ? (y/n) : ");
           PlayAgain=sc.nextLine().toLowerCase();

           if (!PlayAgain.equals("y")){
               break;
           }
        }
        System.out.println("Game over! Your Final Balance is : $"+balance);

    }

    private static int getpayout(String[] row,int bet ) {
        if(row[0].equals(row[1])){
           return switch (row[0]){
                case "🍿" -> bet*2;
                case "🌭" -> bet*3;
                case "🍟" -> bet*4;
                case "🍔" -> bet*5;
                case "🍕" -> bet*10;
               default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]){
                case "🍿" -> bet*2;
                case "🌭" -> bet*3;
                case "🍟" -> bet*4;
                case "🍔" -> bet*5;
                case "🍕" -> bet*10;
                default -> 0;
            };
        }

        return 0;
    }

    private static void printRow(String[] row) {
        System.out.println("******************");
        System.out.println(" "+ String.join(" | ",row));
        System.out.println("******************");
    }

    static String[] spinrow(){
    Random no = new Random();
    String []symbols ={"🍕" ,"🍔", "🍟" ,"🌭", "🍿" } ;
    String[]row = new String[3];

    for (int i = 0; i < 3; i++) {
        row[i] = symbols[no.nextInt(symbols.length)];
    }


    return row;
}
}
