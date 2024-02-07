package com.cejv416.consoleinput;

import java.util.Scanner;

/**
 * Demonstration of numeric input
 *
 * @author omniprof
 */
public class ConsoleInput {

    /**
     * Request a number between 1 and 10 and return it
     *
     * @return
     */
    public int inputIntegerGood() {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 1 and 10: ");
            if (sc.hasNextInt()) { // Check that there is an integer in the keyboard buffer
                number = sc.nextInt(); // 
                // Check if the number is in range
                if (number < 1 || number > 10) {
                    System.out.println("Number out of range.");
                }
            } else { // There was not an integer in the keyboard buffer
                number = -1; // a value that will keep execution in the loop
                System.out.println("You have not entered a number");
            }
            sc.nextLine(); // Clean out the buffer
        } while (number < 1 || number > 10);

        return number;
    }

    /**
     * An input routine that does not handle all issues
     * @return 
     */
    public int inputIntegerBad() {
        int number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter an integer: ");
            number = sc.nextInt();
        } while (number < 1 || number > 10);
        return number;
    }

    /**
     * Where the object begins
     */
    public void perform() {
//        int number = inputIntegerBad();
//        System.out.println("Number = " + number);

        int number = inputIntegerGood();
        System.out.println("Number = " + number);
    }

    /**
     * Where it all begins
     *
     * @param args
     */
    public static void main(String... args) {
        new ConsoleInput().perform();
    }
}
