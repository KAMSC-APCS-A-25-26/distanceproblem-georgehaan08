/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;

public class DistanceMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 points {(x1,y1)(x2,y2)}");
        String input = scan.nextLine();

        input = input.replace("(", " ")
                .replace(")", " ")
                .replace(",", " ");

        String[] parts = input.trim().split("\\s+");

        int x1 = Integer.parseInt(parts[0]);
        int y1 = Integer.parseInt(parts[1]);
        int x2 = Integer.parseInt(parts[2]);
        int y2 = Integer.parseInt(parts[3]);

        double xSub = Math.abs(x2 - x1);
        double ySub = Math.abs(y2 - y1);
        double xSq = (xSub * xSub);
        double ySq = (ySub * ySub);
        double xyAdd = (xSq + ySq);
        System.out.println(Math.sqrt(xyAdd));
    }

}