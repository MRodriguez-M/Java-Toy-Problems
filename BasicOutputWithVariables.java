/*
(1) Print userNum values as indicated.
Output the user's input.

Enter integer: 4
You entered: 4

(2) Output the input squared and cubed.

Enter integer: 4
You entered: 4
4 squared is 16 
And 4 cubed is 64!! 

(3) Get a second user input into userNum2.
Output sum and product.

Enter integer: 4
You entered: 4
4 squared is 16 
And 4 cubed is 64!!
Enter another integer: 5
4 + 5 is 9
4 * 5 is 20
*/
// Import file that allows input reading
import java.util.Scanner; 

public class BasicOutputWithVariables {
   public static void main(String[] args) {
       // Create scanner object and variable for user input
       Scanner scnr = new Scanner(System.in);
       int userNum = 0;
       
       // Prompt user for input
       System.out.print("Enter integer: ");
       userNum = scnr.nextInt();

       // Output user input
       System.out.println("You entered: " + userNum);

       // Calculate and output squared and cubed values for user input
       System.out.println(userNum + " squared is " + (userNum * userNum));
       System.out.println("And " + userNum + " cubed is " + (userNum * userNum * userNum) + "!!");

       // Create variable for second user input and prompt user for said input
       int userNum2 = 0;
       System.out.print("Enter another integer: ");
       userNum2 = scnr.nextInt();

       // Calculate and output sum and product of both user inputs
       System.out.println(userNum + " + " + userNum2 + " is " + (userNum + userNum2));
       System.out.println(userNum + " * " + userNum2 + " is " + (userNum * userNum2));

       return;
   }
}