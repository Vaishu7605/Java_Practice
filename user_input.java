
import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {
        // Get Integer Input From the User
        // create an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        // take input from the user
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // Getting float input
        System.out.println("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
        // form 
        // System.out.println("Enter your Name: ");
        // String myString1 = input.next();
        // System.out.println("Enter your Father's Name: ");
        // String myString2 = input.next();
        // System.out.println("Enter your Mother's Name: ");
        // String myString3 = input.next();
        // System.out.println("Enter your Mobile No.: ");
        // String myString4 = input.next();
        // System.out.println("Enter your Email: ");
        // String myString5 = input.next();
        // System.out.println("Enter your Address: ");
        // String myString6 = input.next();
        // System.out.println("Enter your Gender: ");
        // String myString7 = input.next();
        // System.out.println("Enter your Highest Qualification: ");
        // String myString8 = input.next();

    }
}
