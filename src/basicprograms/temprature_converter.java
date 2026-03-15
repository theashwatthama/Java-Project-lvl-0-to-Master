package basicprograms;

import java.util.Scanner;

public class temprature_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CONVERTING TEMPERATURE USING TENARY OPERATOR

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the Temperature : ");
        temp= sc.nextDouble();
        System.out.print("Enter the unit in which you want to convert (C or F) : ");
        unit = sc.next().toUpperCase();

        newTemp=(unit.equals("C")) ? (temp-32)*5/9 : (temp*9/5)+32 ;

        System.out.printf("%.2f° %s" ,newTemp, unit);
        sc.close();
    }
}
