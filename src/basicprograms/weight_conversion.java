package basicprograms;

import java.util.Scanner;
public class weight_conversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double weight1;
        double weight2;
        int choice;
        double result;

        System.out.println("Weight conversion program");
        System.out.println("1 : Convert kgs to grams ");
        System.out.println("2 : Convert grams to kgs ");
        System.out.print("Choose an option : ");
        choice=sc.nextInt();

        if (choice==1){
            System.out.print("Enter weight in kgs : ");
            weight1=sc.nextDouble();
            result = weight1*1000;
            System.out.printf("The weight in grams :- %.2f",result);

        } else if (choice==2) {
            System.out.print("Enter weight in grams : ");
            weight2=sc.nextDouble();
            result = weight2/1000;
            System.out.printf("The weight in kg :- %.2f",result);

        } else {
            System.out.println("Invalid input please choose either of the choices.");
        }

        sc.close();
    }
}
