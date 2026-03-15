package basicprograms;

import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SIMPLE CALCULATOR USING SWITCH CASES
        double num1;
        double num2;
        char operator;
        double result=0;
        boolean ValidOperation = true;

        System.out.print("Enter the First Number :- ");
        num1= sc.nextDouble();
        System.out.print("Enter the operator (+,-,*,/,^) :- ");
        operator= sc.next().charAt(0);
        System.out.print("Enter the Second Number :- ");
        num2=sc.nextDouble();

        switch (operator){
            case '+' -> result=num1+num2;
            case '-' -> result=num1-num2;
            case '*' -> result=num1*num2;
            case '^' -> result=Math.pow(num1,num2);
            case '/' -> {
                if (num2==0){
                    System.out.println("Cannot divide by zero");
                    ValidOperation=false;
                } else {
                    result = num1/num2;
                }
            }
            default ->{
                System.out.println("Invalid operator");
                 ValidOperation=false;
            }
        }
       if (ValidOperation){
           System.out.println(result);
       }
        sc.close();
    }
}
