import java.util.Scanner;

public class Banking_program {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA BANKLING PROGRAM

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            System.out.println("**************");
            System.out.println("Welcome to Java Bank");
            System.out.println("**************");
            System.out.println("1 : Show Balance");
            System.out.println("2 : Deposit");
            System.out.println("3 : Withdraw");
            System.out.println("4 : Exit");
            System.out.println("**************");

            System.out.print("Select an option (1-4) :");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance=balance+deposit(balance);
                case 3 -> balance=balance-withdraw(balance);
                case 4 -> isRunning = false;
                default  -> {
                    System.out.println("Invalid input please choose either of the choices.");
                }

            }
        }
    }
    static void showBalance(double balance) {
        System.out.printf("Your current balance is : $%.2f\n", balance);
    }
    static double deposit(double balance) {
        double amount;
        System.out.println("Enter the amount you want to deposit : ");
        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount please enter a positive value.");
            return 0;
        } else {
            return amount;
        }
    }
    static double withdraw(double balance) {
        double amount ;
        System.out.println("Enter the amount you want to withdraw : ");
        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount please enter a positive value.");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return 0;
        } else {
            return amount;
    }

    }
}