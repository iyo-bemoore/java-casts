import java.util.Locale;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Welcome to food & beverage survey");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello "+name);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("Thank you "+name+" We will shortly ask you a couple of questions regarding your consumption habits.");
        System.out.println("Write YES to proceed or NO to exit");
        scan.nextLine();
        String  approval = scan.nextLine();
        System.out.println("Approval is " +approval);
        if(approval.equals("NO") ){
          scan.close();
          System.out.println("Thank you for your patience!");
          System.exit(0);
          return;
        }        
        System.out.println("How much do you spend on coffee on a weekly basis?");
        double coffeeSpendings = scan.nextDouble();
        System.out.println("How much do you spend on Fast food on weekly basis?");
        double fastFoodSpendings = scan.nextDouble();
        System.out.println("Thank you for your participation");
        System.out.println("--------- Summary ---------- ");
        System.out.println("Participant name: "+name);
        System.out.println("Participant age: "+age+" years old.");
        System.out.println("Participant Coffee spendings: "+coffeeSpendings+"$");
        System.out.println("Participant Coffee Fast food spendings: "+fastFoodSpendings+"$");
        System.out.println("--------- End Survey ---------- ");    
        scan.close();

    }
    
}
