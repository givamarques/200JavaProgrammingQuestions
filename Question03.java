/*Simple Numbers
Find the largest digit*/
import java.util.Scanner; //import scanner

public class Question03 {
    static void Digits(int n)
    {
        int largest = 0;
        int smallest = 9;

        while(n != 0)
        {
            int r = n % 10;

            // Find the largest digit
            largest = Math.max(r, largest);

            // Find the smallest digit
            smallest = Math.min(r, smallest);

            n = n / 10;
        }
        System.out.println("The largest number is: " + largest + " and teh smallest: " + smallest);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number:"); // asks user

        int userNumber = myObj.nextInt();  // Read user string input

        Digits(userNumber);
    }
}
