/*
(1) Prompt the user to enter five numbers, being five people's weights.
Store the numbers in an array of doubles.
Output the array's numbers on one line, each number followed by one space.

Enter weight 1: 236
Enter weight 2: 89.5
Enter weight 3: 142
Enter weight 4: 166.3
Enter weight 5: 93

You entered: 236.0 89.5 142.0 166.3 93.0

(2) Also output the total weight, by summing the array's elements.

(3) Also output the average of the array's elements.

(4) Also output the max array element.

Enter weight 1: 236
Enter weight 2: 89.5
Enter weight 3: 142
Enter weight 4: 166.3
Enter weight 5: 93

You entered: 236.0 89.5 142.0 166.3 93.0
Total weight: 726.8
Average weight: 145.35999999999999
Max weight: 236.0
*/

import java.util.Scanner;

public class PeoplesWeights {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 5;
        double[] weights = new double[NUM_ELEMENTS];
        int i = 0;
        double sum = 0;

        // For loop to prompt user for five weights
        for (i = 0; i < NUM_ELEMENTS; i++) {
            System.out.printf("Enter weight %d: ", (i + 1));
            weights[i] = scnr.nextDouble();
        }
        
        System.out.print("\nYou entered: ");
        // For loop to output five weights from array
        for (i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(weights[i] + " ");
        }

        // For loop to calculate the sum of all weights in the array
        for (i = 0; i < weights.length; i++) {
            sum = sum + weights[i];
        }
        // Output sum of weights
        System.out.printf("\nTotal weight: " + sum);
        
        // Calculate and output average of weights
        System.out.println("\nAverage weight: " + (sum / NUM_ELEMENTS));

        double maxWeight = weights[0];
        // For loop to go through every value in the array
        for (i = 0; i < weights.length; i++) {
            // If statement to compare value to current max weight and change max weight if the value is greater
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
            }
        }
        // Output max weight value
        System.out.print("Max weight: " + maxWeight);
    }
}