/*
(1) Prompt the user to input a wall's height and width.
Calculate and output the wall's area.

Enter wall height (feet): 12
Enter wall width (feet): 15
Wall area: 180.0 square feet

(2) Extend to also calculate and output the amount of paint in gallons needed to paint the wall.
Assume a gallon of paint covers 350 square feet.
Store this value using a const double variable.

Enter wall height (feet): 12
Enter wall width (feet): 15
Wall area: 180.0 square feet
Paint needed: 0.5142857142857142 gallons

(3) Extend to also calculate and output the number of 1 gallon cans needed to paint the wall.

Enter wall height (feet): 12
Enter wall width (feet): 15
Wall area: 180.0 square feet
Paint needed: 0.5142857142857142 gallons
Cans needed: 1 can(s)
*/

import java.util.Scanner;

public class PaintingAWall {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int wallHeight = 0;
        int wallWidth = 0;

        // Prompt user for wall height and width
        System.out.print("Enter wall height (feet): ");
        wallHeight = scnr.nextInt();
        System.out.print("Enter wall width (feet): ");
        wallWidth = scnr.nextInt();

        // Calculate and output wall area
        double wallArea = wallHeight * wallWidth;
        System.out.print("Wall area: " + wallArea + " square feet");
    }
}