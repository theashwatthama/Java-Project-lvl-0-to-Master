import java.util.Scanner;
public class Compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount : ");
        principle=sc.nextDouble();
        System.out.print("Enter the interest rate (in %) : ");
        rate=sc.nextDouble()/100;
        System.out.print("Enter the # of times compounded per year : ");
        timesCompounded= sc.nextInt();
        System.out.print("Enter the # of years : ");
        years=sc.nextInt();

        amount=principle*Math.pow(1+rate/timesCompounded,timesCompounded*years);
        System.out.println("The amount after "+years+" is : "+amount);
        sc.close();
    }
}
