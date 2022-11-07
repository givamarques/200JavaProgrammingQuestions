/*Simple Numbers
1. Find a digit at a specific place in a number */
import java.util.Scanner; //import scanner

public class Question01 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number"); // asks user

        String userNumber = myObj.nextLine();  // Read user input

        char firstChar = userNumber.charAt(0); // get the first character (position zero)

        System.out.println("First number is: " + firstChar);  // Output user input
    }
}
