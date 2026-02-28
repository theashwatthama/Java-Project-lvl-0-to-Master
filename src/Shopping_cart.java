import java.util.Scanner;
public class Shopping_cart {
    public static void main(String[] args) {
        // JUST FOR PRACTICE

        // BASIC SHOPPING CART PROGRAM

        Scanner sc = new Scanner(System.in);
        double price;
        int quantity;
        String item;
        double total;
        char currency ='$';

        System.out.print("What item would you like to buy : ");
        item = sc.nextLine();
        System.out.print("What is the price for each : ");
        price = sc.nextDouble();
        System.out.print("How much whould you like to have : ");
        quantity = sc.nextInt();
        total= price * quantity;
        System.out.println("\nSo, you bought "+quantity+" "+item+" and your total amount is : "+currency+total );
        System.out.println("Thanx for shopping visit again");

    }
}
