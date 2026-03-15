import java.util.Scanner;

public class SearchanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] fruits = {"Pineapple","Apple","Bananna","Kiwi"};
        System.out.print("Enter the fruit : ");
        String target = sc.nextLine();
        Boolean isfound=false;
        for (int i = 0; i < fruits.length; i++) {
           if (fruits[i].equalsIgnoreCase(target)){
               System.out.println("Element found at index : "+i);
               isfound=true;
               break;
           }
        }
        if(!isfound){
            System.out.println("Element not found");
        }
    }
}
