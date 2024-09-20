/*
* To compare two randomly generated arrays
* Prashant Gupta
 * November 7 2023
 */

import java.util.*;

public class ArrayComparison {

    public static void main(String[] args) {

        int elements = 20;
        int lowLimit = -10;
        int highLimit = 15;
        int[] firstArray = initializeArray(elements, 
                lowLimit, highLimit);   
        int[] secondArray = initializeArray(elements, 
                lowLimit, highLimit);
        
        printTwoArrays(firstArray, secondArray);
        compareArrays(firstArray, secondArray); 
    }

    public static int[] initializeArray (int arrayLength, int lowerLimit, 
            int higherLimit){

        Random randGen = new Random();
        int[] arrayOfNum = new int[arrayLength];
        int numOfVal = higherLimit - lowerLimit + 1;

        for(int index = 0; index < arrayLength; index++){
            arrayOfNum[index] = randGen.nextInt(numOfVal) + lowerLimit;
        }
        return arrayOfNum;
    }

    public static void printTwoArrays(int[] array1, int[] array2){

        int highestNum = 0;
        for(int index = 0; index < array1.length; index++){
            if(index + 1 < array1.length && array1[index + 1] > array1[index]){
                highestNum = array1[index + 1];
            }
        }
        for(int index = 0; index < array2.length; index++){
            if(index + 1 < array2.length && array2[index + 1] > array2[index]){
                highestNum = array2[index + 1];
            }
        }

        int lowestNum = 0;
        for(int index = 0; index < array1.length; index++){
            if(index + 1 < array1.length && array1[index + 1] < array1[index]){
                lowestNum = array1[index + 1];
            }
        }
        for(int index = 0; index < array2.length; index++){
            if(index + 1 < array2.length && array2[index + 1] < array2[index]){
                lowestNum = array2[index + 1];
            }
        }


        for(int index = 0; index < array1.length; index++){
            String out = "index ";
                out += String.format("%"+ numWidth(array1.length) + "d:",
                        index);
                        
            if(numWidth(highestNum) > numWidth(lowestNum)){
                out += String.format(" %" + numWidth(highestNum) + "d",
                        array1[index]);
                out += String.format(" %" + numWidth(highestNum) + "d",
                        array2[index]);
            }
            else{
                out += String.format(" %" + numWidth(lowestNum) + "d",
                        array1[index]);
                out += String.format(" %" + numWidth(lowestNum) + "d",
                        array2[index]);
            }
                
            System.out.println(out);
        }
    }

    public static void compareArrays(int[] array1, int[] array2){

        int array1Highs = 0;
        int array2Highs = 0;
        int ties = 0;

        for(int index = 0; index < array1.length; index++){
            if(array1[index] > array2[index]){
                array1Highs++;
            }
            else if(array2[index] > array1[index]){
                array2Highs++;
            }
            else{
                ties++;
            }
        }

        String result = String.format("\narray 1 has %"
                + numWidth(array1.length) + "d highs\n", array1Highs);
            result += String.format("array 2 has %"
                    + numWidth(array1.length) + "d highs\n", 
                    array2Highs);
            result += String.format("  There are %"
                    + numWidth(array1.length) + "d tie(s)\n", ties);
        System.out.println(result);
    }

    public static int numWidth(int num){

        int numDigits = 1;
        double newNum = 0;
        boolean haveDigits = true;

        if(num > 0){
            double doubleNum = (double) num;
            newNum = doubleNum;
           
        }
        else if(num < 0){
            numDigits++;
            double doubleNum = (double) num * (-1);
            newNum = doubleNum;
        }        
        
        while(haveDigits){
            if(newNum / 10 < 1){
                haveDigits = false;
            }
            else{
                numDigits++;
                newNum = newNum / 10;
            }
        }
        return numDigits;
    }
}