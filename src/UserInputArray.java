import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] foods ;
        System.out.println("Enter no. of food u want to order : ");
        int size = sc.nextInt();
        sc.nextLine();
        foods = new String[size];

        for (int i = 0; i < foods.length ; i++) {
            System.out.println("Enter a food : ");
            foods[i]= sc.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }

    }
}
