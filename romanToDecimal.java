/*
 * Translate roman numerals to base 10 numbers
 * Prashant Gupta
 * 25 September 2023
 */

 import java.util.*;


public class romanToDecimal {

    public static void main(String[] args) {

        Scanner keyIn = new Scanner(System.in);

        String introPrompt = "\nThe program will convert base ten numbers "
                + "to Roman numerals\n";
        String invalidInPrompt = "\nInvalid Input!\nThe range of "
                + "supported numbers is 1-999.\nAny other value "
                + "is not supported.\n";
        String inputPrompt = "\nEnter base ten numbers ranging from"
                + " 1 to 999\n" +
                "If you want to enter 769, simply enter 769 "
                + "and hit Enter/Return\n--> ";
        String outPrompt = "\nThe roman numeral for entered base "
                + "ten number is: ";
        String endPrompt = "\nThe number has been converted\n"
                + "Terminating program...";
        
        System.out.println(introPrompt);
        System.out.print(inputPrompt);
        
        int usrInput = keyIn.nextInt();
        int unitDigit = usrInput % 10;
        int tensDigit = (usrInput % 100)/10;
        int hundredsDigit = (usrInput / 100);
        String outRomanNum = "";

        if (usrInput < 1 || usrInput > 999){
            System.out.println(invalidInPrompt);
        }

        else {
            
            System.out.println("The isolated digits are: " 
                + hundredsDigit + " " + tensDigit + " " + unitDigit);

            switch(hundredsDigit){

                case 1:
                    outRomanNum += "C";
                    break;
                case 2:
                    outRomanNum += "CC";
                    break;
                case 3:
                    outRomanNum += "CCC";
                    break;
                case 4:
                    outRomanNum += "CD";
                    break;
                case 5:
                    outRomanNum += "D";
                    break;
                case 6:
                    outRomanNum += "DC";
                    break;
                case 7:
                    outRomanNum += "DCC";
                    break;
                case 8:
                    outRomanNum += "DCCC";
                    break;
                case 9:
                    outRomanNum += "CM";
                    break;
            }

            switch(tensDigit){

                case 1:
                    outRomanNum += "X";
                    break;
                case 2:
                    outRomanNum += "XX";
                    break;
                case 3:
                    outRomanNum += "XXX";
                    break;
                case 4:
                    outRomanNum += "XL";
                    break;
                case 5:
                    outRomanNum += "L";
                    break;
                case 6:
                    outRomanNum += "LX";
                    break;
                case 7:
                    outRomanNum += "LXX";
                    break;
                case 8:
                    outRomanNum += "LXXX";
                    break;
                case 9:
                    outRomanNum += "XC";
                    break;
            }

            switch(unitDigit){

                case 1:
                    outRomanNum += "I";
                    break;
                case 2:
                    outRomanNum += "II";
                    break;
                case 3:
                    outRomanNum += "III";
                    break;
                case 4:
                    outRomanNum += "IV";
                    break;
                case 5:
                    outRomanNum += "V";
                    break;
                case 6:
                    outRomanNum += "VI";
                    break;
                case 7:
                    outRomanNum += "VII";
                    break;
                case 8:
                    outRomanNum += "VIII";
                    break;
                case 9:
                    outRomanNum += "IX";
                    break;
            }
            System.out.println(outPrompt + outRomanNum);
        }
        System.out.println(endPrompt);
    }
}
