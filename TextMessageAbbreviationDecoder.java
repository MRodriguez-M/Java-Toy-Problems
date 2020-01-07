/*
(1) If a user's input string matches a known text message abbreviation, output the unabbreviated form, else output: Unknown.
Support two abbreviations: LOL -- laughing out loud, and IDK -- I don't know.

Input an abbreviation: LOL
laughing out loud

(2) Expand to also decode these abbreviations.

BFF -- best friends forever
IMHO -- in my humble opinion
TMI -- too much information
*/

import java.util.Scanner;

public class TextMessageAbbreviationDecoder {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       String abbreviation = "";

       // Prompt user for abbreviation input
       System.out.print("Input an abbreviation: ");
       abbreviation = scnr.next();

       // If statement to check if user input is "LOL"
       if (abbreviation.equals("LOL")) {
           // Output unabbreviated form
           System.out.print("laughing out loud");
       }
       // Else if statement to check if user input is "IDK"
       else if (abbreviation.equals("IDK")) {
           // Output unabbreviated form
           System.out.print("I don't know");
       }
       else {
           // Output message if user input does not match any of the above
           System.out.print("Unknown");
       }
       
       return;
   }
}