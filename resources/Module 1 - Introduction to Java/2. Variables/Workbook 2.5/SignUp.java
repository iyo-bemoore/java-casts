import java.util.Locale;
import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("Please Enter your first name");
        String firstName = scan.nextLine();
        //Ask for their last name.
        System.out.println("Please enter your lastname");
        String lastName = scan.nextLine();
        //Ask: how old are you?
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter a username");
        String userName = scan.nextLine();
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        //Ask what city they live in.
        System.out.println("Please enter your city");
        String city  = scan.nextLine();
        //Ask what country that's from.
        System.out.println("Please enter your country");
        String country  = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:
        System.out.println("Your information:");
        System.out.println("\t First Name: "+firstName);
        System.out.println("\t Last Name: "+lastName);
        System.out.println("\t Age: "+age);
        System.out.println("\t Username: "+userName);
        System.out.println("\t City: "+city);
        System.out.println("\t Country: "+country);

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //

        scan.close();
        //close scanner. It's good practice :D ! 
    }
}
