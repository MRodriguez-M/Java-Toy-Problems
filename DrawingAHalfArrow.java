/*
(1) Use a loop to output an arrow base of height arrowBaseHeight.

(2) Use a loop to output an arrow base of width arrowBaseWidth.
Use a nested loop in which the inner loop draws the *’s, and the outer loop iterates a number of times equal to the height of the arrow base.

(3) Use a loop to output an arrow head of width arrowHeadWidth.
Use a nested loop in which the inner loop draws the *’s, and the outer loop iterates a number of times equal to the height of the arrow head.

(4) Modify the program to only accept an arrow head width that is larger than the arrow base width.
Use a loop to continue prompting the user for an arrow head width until the value is larger than the arrow base width.

while (arrowHeadWidth <= arrowBaseWidth) {
   System.out.println("Enter arrow head width: ");
   arrowHeadWidth = scnr.nextInt();
}

Example output for arrowBaseHeight = 5, arrowBaseWidth = 2, and arrowHeadWidth = 4:

Enter arrow base height: 5
Enter arrow base width: 2
Enter arrow head width: 4
**
**
**
**
**
****
***
**
*
*/

import java.util.Scanner;

public class DrawingAHalfArrow {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int arrowBaseHeight = 0;
    int arrowBaseWidth = 0;
    int arrowHeadWidth = 0;
    int h = 0;

    // Prompt user for dimensions of arrow
    System.out.print("Enter arrow base height: ");
    arrowBaseHeight = scnr.nextInt();

    // For loop to print arrow base height
    for (h = 0; h < arrowBaseHeight; h++) {
        System.out.println("*");
    }
    }
}