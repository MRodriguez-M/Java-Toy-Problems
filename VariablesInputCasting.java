/*
(1) Prompt the user to input an integer, a double, a character, and a string, storing each into separate variables.
Then, output those four values on a single line separated by a space.

Enter integer: 99
Enter double: 3.77
Enter character: z
Enter string: Howdy
99 3.77 z Howdy

(2) Extend to also output in reverse.

Enter integer: 99
Enter double: 3.77
Enter character: z
Enter string: Howdy
99 3.77 z Howdy
Howdy z 3.77 99

(3) Extend to cast the double to an integer, and output that integer.

Enter integer: 99
Enter double: 3.77
Enter character: z
Enter string: Howdy
99 3.77 z Howdy
Howdy z 3.77 99
3.77 cast to an integer is 3
*/

import java.util.Scanner;

public class VariablesInputCasting {
    public static void main(String[] args) {
        // Create variables for scanner and user input
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        char userChar = ' ';
        String userString = "";

        // Prompt user for integer, double, character, and string
        System.out.print("Enter integer: ");
        userInt = scnr.nextInt();
        System.out.print("Enter double: ");
        userDouble = scnr.nextDouble();
        System.out.print("Enter character: ");
        userChar = scnr.next().charAt(0);
        System.out.print("Enter string: ");
        userString = scnr.next();

        // Output user input
        System.out.print(userInt + " " + userDouble + " " + userChar + " " + userString);
    }
}