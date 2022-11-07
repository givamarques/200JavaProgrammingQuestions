/*Simple Numbers
2. Find the count of digits in a number */
import java.util.Scanner; //import scanner

public class Question02 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number"); // asks user

        String userNumber = myObj.nextLine();  // Read user input

        System.out.println("You typed " + userNumber.length() + " digits.");  // Output user input
    }
}