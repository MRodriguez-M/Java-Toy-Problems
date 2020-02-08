/*
(1) Prompt user for a string that contains two strings separated by a comma.

Examples of strings that can be accepted:
Jill, Allen
Jill , Allen
Jill,Allen

Enter input string: Jill, Allen

(2) Report an error if the input string does not contain a comma.
Continue to prompt until a valid string is entered.

Enter input string: Jill Allen
Error: No comma in string
Enter input string: Jill, Allen

(3) Extract the two words form the input string and remove any spaces.
Store the strings in two separate variables and output the strings.

Enter input string: Jill, Allen
First word: Jill
Second word: Allen

(4) Using a loop, extend the program to handle multiple lines of input.
Continue until the user enters q to quit.

Enter input string: Jill, Allen
First word: Jill
Second word: Allen


Enter input string: Golden , Monkey
First word: Golden
Second word: Monkey


Enter input string: Washington,DC
First word: Washington
Second word: DC


Enter input string: q
*/

import java.util.Scanner;

public class ParsingStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "";

        // Prompt user for string
        System.out.print("Enter input string: ");
        userInput = scnr.nextLine();
    }
}