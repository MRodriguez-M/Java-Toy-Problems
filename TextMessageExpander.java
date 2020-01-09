/*
(1) Use scnr.nextLine(); to get a line of user input into a string.
Output that line.

Enter text: IDK how that happened. TTYL. 
You entered: IDK how that happened. TTYL.

(2) Expand common text message abbreviations.
Output a message for each abbreviation that is expanded, then output the expanded line.

Support these abbreviations (you only need to support these):

BFF -- best friend forever
IDK -- I don't know
JK -- just kidding
TMI -- too much information
TTYL -- talk to you later

Enter text: IDK how that happened. TTYL. 
You entered: IDK how that happened. TTYL.

Replaced "IDK" with "I don't know".
Replaced "TTYL" with "talk to you later".

Expanded: I don't know how that happened. talk to you later.
*/

import java.util.Scanner;

public class TextMessageExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "";

        // Prompt user for input
        System.out.print("Enter text: ");
        userInput = scnr.nextLine();

        // Output user input
        System.out.println("You entered: " + userInput);
        System.out.print("\n");

        // Five separate if statements to check for each of the available abbreviations
        if (userInput.contains("BFF")) {
            // Replace abbreviation with expanded version if in the string
            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
            userInput = userInput.replace("BFF", "best friend forever");
        }
        if (userInput.contains("IDK")) {
            System.out.println("Replaced \"IDK\" with \"I don't know\".");
            userInput = userInput.replace("IDK", "I don't know");
        }
        if (userInput.contains("JK")) {
            System.out.println("Replaced \"JK\" with \"just kidding\".");
            userInput = userInput.replace("JK", "just kidding");
        }
        if (userInput.contains("TMI")) {
            System.out.println("Replaced \"TMI\" with \"too much information\".");
            userInput = userInput.replace("TMI", "too much information");
        }
        if (userInput.contains("TTYL")) {
            System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
            userInput = userInput.replace("TTYL", "talk to you later");
        }

        // Output user input with expanded abbreviations
        System.out.print("\nExpanded: " + userInput);

        return;
    }
}