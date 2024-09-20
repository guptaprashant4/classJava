/*
 * Purpose: To generate 10 random numbers within a given range
 * Author: Prashant Gupta
 * Date modified: 8 September 2023
 */

import java.util.*;

public class print_random_num {

    public static void main(String[] args) {
        
        Scanner keyboardScanner = new Scanner(System.in);

        String welcomePrompt = "\nThis program will generate ten random "
                + "numbers for user provided values\n\n";
        System.out.print(welcomePrompt);

        String initialPrompt = "Please enter a lower and higher number for the "
                + "range of random numbers to generate";
                initialPrompt += "\nIf you want to enter 55, simply type in 10 "
                        + "and hit Enter/Return\n";
        System.out.print(initialPrompt);

        String expectValuePrompt = "\nThe limit for numbers to be generated "
                + "can be any real number from";
                    expectValuePrompt += "-2147483648 to 2147483647\n";
        System.out.print(expectValuePrompt);

        String lowerValuePrompt = "\nLower number: ";
        System.out.print(lowerValuePrompt);
        int lowerRangeValue = keyboardScanner.nextInt();
        System.out.println("The lower value for the numbers to be generated is " 
                + lowerRangeValue);

        String higherValuePrompt = "\nHigher number: ";
        System.out.print(higherValuePrompt);
        int higherRangeValue = keyboardScanner.nextInt();
        System.out.println("The higher value for the numbers to be generated"
                + " is " + higherRangeValue + "\n");
        
        Random randGen = new Random();

        int numOfValues = higherRangeValue - lowerRangeValue + 1;
        int randNum1 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum2 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum3 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum4 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum5 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum6 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum7 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum8 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum9 = randGen.nextInt(numOfValues) + lowerRangeValue;
        int randNum10 = randGen.nextInt(numOfValues) + lowerRangeValue;

        System.out.println("Random number: " + randNum1);
        System.out.println("Random number: " + randNum2);
        System.out.println("Random number: " + randNum3);
        System.out.println("Random number: " + randNum4);
        System.out.println("Random number: " + randNum5);
        System.out.println("Random number: " + randNum6);
        System.out.println("Random number: " + randNum7);
        System.out.println("Random number: " + randNum8);
        System.out.println("Random number: " + randNum9);
        System.out.println("Random number: " + randNum10);

        String endPrompt = "\nTen random numbers have been generated.\n";
                endPrompt += "The program will now terminate...\n";
        System.out.print(endPrompt);

    }
}