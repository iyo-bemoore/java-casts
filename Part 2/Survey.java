import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Shop & Go");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello "+name);
        System.out.println("How much would you like to spend on coffee?");
        double coffeSpendingPrice = scan.nextDouble();
        System.out.println("Thank you "+name+" We have submitted your order for "+coffeSpendingPrice);
        System.out.println("Good bye now!");        
    }
    
}
