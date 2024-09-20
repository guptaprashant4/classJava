/*
 * To simulate dice rolls and play HigherLowerGame with a computer
 * Prashant Gupta
 * 15 September 2023
 */


import java.util.*;

public class HighLowGame {

    public static void main(String[] args) {
        
        Random randGen = new Random();
        Scanner keyboard = new Scanner(System.in);

        int userNum1 = randGen.nextInt(6) + 1;
        int userNum2 = randGen.nextInt(6) + 1;
        int userNum3 = randGen.nextInt(6) + 1;
        int userNum4 = randGen.nextInt(6) + 1;
        int userNum5 = randGen.nextInt(6) + 1;

        int compNum1 = randGen.nextInt(6) + 1;
        int compNum2 = randGen.nextInt(6) + 1;
        int compNum3 = randGen.nextInt(6) + 1;
        int compNum4 = randGen.nextInt(6) + 1;
        int compNum5 = randGen.nextInt(6) + 1;

        int userTotal = userNum1 + userNum2 + userNum3 + userNum4 + userNum5;
        int compTotal = compNum1 + compNum2 + compNum3 + compNum4 + compNum5;
        int totalDiff = userTotal - compTotal;

        Scanner scanUser1stDiceRoll = new Scanner(
                selectDiceImg(userNum1));
        Scanner scanUser2ndDiceRoll = new Scanner(
                selectDiceImg(userNum2));
        Scanner scanUser3rdDiceRoll = new Scanner(
                selectDiceImg(userNum3));
        Scanner scanUser4thDiceRoll = new Scanner(
                selectDiceImg(userNum4));
        Scanner scanUser5thDiceRoll = new Scanner(
                selectDiceImg(userNum5));
        Scanner scancomp1stDiceRoll = new Scanner(
                selectDiceImg(compNum1));
        Scanner scanComp2ndDiceRoll = new Scanner(
                selectDiceImg(compNum2));
        Scanner scanComp3rdDiceRoll = new Scanner(
                selectDiceImg(compNum3));
        Scanner scanComp4thDiceRoll = new Scanner(
                selectDiceImg(compNum4));
        Scanner scanComp5thDiceRoll = new Scanner(
                selectDiceImg(compNum5));

       
        String userDiceRollLine1 = scanUser1stDiceRoll.nextLine();
                userDiceRollLine1 += "       ";
                userDiceRollLine1 += scanUser2ndDiceRoll.nextLine();
                userDiceRollLine1 += "       ";
                userDiceRollLine1 += scanUser3rdDiceRoll.nextLine();
                userDiceRollLine1 += "       ";
                userDiceRollLine1 += scanUser4thDiceRoll.nextLine();
                userDiceRollLine1 += "       ";
                userDiceRollLine1 += scanUser5thDiceRoll.nextLine();
        String userDiceRollLine2 = scanUser1stDiceRoll.nextLine();
                userDiceRollLine2 += "      ";
                userDiceRollLine2 += scanUser2ndDiceRoll.nextLine();
                userDiceRollLine2 += "      ";
                userDiceRollLine2 += scanUser3rdDiceRoll.nextLine();
                userDiceRollLine2 += "      ";
                userDiceRollLine2 += scanUser4thDiceRoll.nextLine();
                userDiceRollLine2 += "      ";
                userDiceRollLine2 += scanUser5thDiceRoll.nextLine();
        String userDiceRollLine3 = scanUser1stDiceRoll.nextLine();
                userDiceRollLine3 += "     ";
                userDiceRollLine3 += scanUser2ndDiceRoll.nextLine();
                userDiceRollLine3 += "     ";
                userDiceRollLine3 += scanUser3rdDiceRoll.nextLine();
                userDiceRollLine3 += "     ";
                userDiceRollLine3 += scanUser4thDiceRoll.nextLine();
                userDiceRollLine3 += "     ";
                userDiceRollLine3 += scanUser5thDiceRoll.nextLine();
        String userDiceRollLine4 = scanUser1stDiceRoll.nextLine();
                userDiceRollLine4 += "     ";
                userDiceRollLine4 += scanUser2ndDiceRoll.nextLine();
                userDiceRollLine4 += "     ";
                userDiceRollLine4 += scanUser3rdDiceRoll.nextLine();
                userDiceRollLine4 += "     ";
                userDiceRollLine4 += scanUser4thDiceRoll.nextLine();
                userDiceRollLine4 += "     ";
                userDiceRollLine4 += scanUser5thDiceRoll.nextLine();
        String userDiceRollLine5 = scanUser1stDiceRoll.nextLine();
                userDiceRollLine5 += "     ";
                userDiceRollLine5 += scanUser2ndDiceRoll.nextLine();
                userDiceRollLine5 += "     ";
                userDiceRollLine5 += scanUser3rdDiceRoll.nextLine();
                userDiceRollLine5 += "     ";
                userDiceRollLine5 += scanUser4thDiceRoll.nextLine();
                userDiceRollLine5 += "     ";
                userDiceRollLine5 += scanUser5thDiceRoll.nextLine();
        String userDiceRollLine6 = scanUser1stDiceRoll.nextLine();
                userDiceRollLine6 += "     ";
                userDiceRollLine6 += scanUser2ndDiceRoll.nextLine();
                userDiceRollLine6 += "     ";
                userDiceRollLine6 += scanUser3rdDiceRoll.nextLine();
                userDiceRollLine6 += "     ";
                userDiceRollLine6 += scanUser4thDiceRoll.nextLine();
                userDiceRollLine6 += "     ";
                userDiceRollLine6 += scanUser5thDiceRoll.nextLine();
        String userDiceRollLine7 = scanUser1stDiceRoll.nextLine();
                userDiceRollLine7 += "     ";
                userDiceRollLine7 += scanUser2ndDiceRoll.nextLine();
                userDiceRollLine7 += "     ";
                userDiceRollLine7 += scanUser3rdDiceRoll.nextLine();
                userDiceRollLine7 += "     ";
                userDiceRollLine7 += scanUser4thDiceRoll.nextLine();
                userDiceRollLine7 += "     ";
                userDiceRollLine7 += scanUser5thDiceRoll.nextLine();
        String userDiceRollLine8 = scanUser1stDiceRoll.nextLine();
                userDiceRollLine8 += "      ";
                userDiceRollLine8 += scanUser2ndDiceRoll.nextLine();
                userDiceRollLine8 += "        ";
                userDiceRollLine8 += scanUser3rdDiceRoll.nextLine();
                userDiceRollLine8 += "        ";
                userDiceRollLine8 += scanUser4thDiceRoll.nextLine();
                userDiceRollLine8 += "         ";
                userDiceRollLine8 += scanUser5thDiceRoll.nextLine();

        String compDiceRollLine1 = scancomp1stDiceRoll.nextLine();
                compDiceRollLine1 += "       ";
                compDiceRollLine1 += scanComp2ndDiceRoll.nextLine();
                compDiceRollLine1 += "       ";
                compDiceRollLine1 += scanComp3rdDiceRoll.nextLine();
                compDiceRollLine1 += "       ";
                compDiceRollLine1 += scanComp4thDiceRoll.nextLine();
                compDiceRollLine1 += "       ";
                compDiceRollLine1 += scanComp5thDiceRoll.nextLine();
        String compDiceRollLine2 = scancomp1stDiceRoll.nextLine();
                compDiceRollLine2 += "      ";
                compDiceRollLine2 += scanComp2ndDiceRoll.nextLine();
                compDiceRollLine2 += "      ";
                compDiceRollLine2 += scanComp3rdDiceRoll.nextLine();
                compDiceRollLine2 += "      ";
                compDiceRollLine2 += scanComp4thDiceRoll.nextLine();
                compDiceRollLine2 += "      ";
                compDiceRollLine2 += scanComp5thDiceRoll.nextLine();
        String compDiceRollLine3 = scancomp1stDiceRoll.nextLine();
                compDiceRollLine3 += "     ";
                compDiceRollLine3 += scanComp2ndDiceRoll.nextLine();
                compDiceRollLine3 += "     ";
                compDiceRollLine3 += scanComp3rdDiceRoll.nextLine();
                compDiceRollLine3 += "     ";
                compDiceRollLine3 += scanComp4thDiceRoll.nextLine();
                compDiceRollLine3 += "     ";
                compDiceRollLine3 += scanComp5thDiceRoll.nextLine();
        String compDiceRollLine4 = scancomp1stDiceRoll.nextLine();
                compDiceRollLine4 += "     ";
                compDiceRollLine4 += scanComp2ndDiceRoll.nextLine();
                compDiceRollLine4 += "     ";
                compDiceRollLine4 += scanComp3rdDiceRoll.nextLine();
                compDiceRollLine4 += "     ";
                compDiceRollLine4 += scanComp4thDiceRoll.nextLine();
                compDiceRollLine4 += "     ";
                compDiceRollLine4 += scanComp5thDiceRoll.nextLine();
        String compDiceRollLine5 = scancomp1stDiceRoll.nextLine();
                compDiceRollLine5 += "     ";
                compDiceRollLine5 += scanComp2ndDiceRoll.nextLine();
                compDiceRollLine5 += "     ";
                compDiceRollLine5 += scanComp3rdDiceRoll.nextLine();
                compDiceRollLine5 += "     ";
                compDiceRollLine5 += scanComp4thDiceRoll.nextLine();
                compDiceRollLine5 += "     ";
                compDiceRollLine5 += scanComp5thDiceRoll.nextLine();
        String compDiceRollLine6 = scancomp1stDiceRoll.nextLine();
                compDiceRollLine6 += "     ";
                compDiceRollLine6 += scanComp2ndDiceRoll.nextLine();
                compDiceRollLine6 += "     ";
                compDiceRollLine6 += scanComp3rdDiceRoll.nextLine();
                compDiceRollLine6 += "     ";
                compDiceRollLine6 += scanComp4thDiceRoll.nextLine();
                compDiceRollLine6 += "     ";
                compDiceRollLine6 += scanComp5thDiceRoll.nextLine();
        String compDiceRollLine7 = scancomp1stDiceRoll.nextLine();
                compDiceRollLine7 += "     ";
                compDiceRollLine7 += scanComp2ndDiceRoll.nextLine();
                compDiceRollLine7 += "     ";
                compDiceRollLine7 += scanComp3rdDiceRoll.nextLine();
                compDiceRollLine7 += "     ";
                compDiceRollLine7 += scanComp4thDiceRoll.nextLine();
                compDiceRollLine7 += "     ";
                compDiceRollLine7 += scanComp5thDiceRoll.nextLine();
        String compDiceRollLine8 = scancomp1stDiceRoll.nextLine();
                compDiceRollLine8 += "      ";
                compDiceRollLine8 += scanComp2ndDiceRoll.nextLine();
                compDiceRollLine8 += "        ";
                compDiceRollLine8 += scanComp3rdDiceRoll.nextLine();
                compDiceRollLine8 += "        ";
                compDiceRollLine8 += scanComp4thDiceRoll.nextLine();
                compDiceRollLine8 += "         ";
                compDiceRollLine8 += scanComp5thDiceRoll.nextLine();
 

        String introPrompt = "\nWelcome\n";
                introPrompt += "Higher Lower Game\n\n";
                introPrompt += selectDiceImg(0);
                introPrompt += "\nThis is a simulation for HigherLowerGame "
                        + "where the user can play ";
                introPrompt += "the game against computer\n\n Rolling "
                        + "dice....\n\n";

        String compPlayingPrompt = "\nComputer rolling dice....";

        String userInputPrompt = "\nEnter your guess\nIs your number higher "
                + "or lower than computer's?";
                userInputPrompt += "\nType h/hi/higher if you guess your "
                        + "value will be higher\n";
                userInputPrompt += "Type l/lo/lower if you guess your "
                        + "value will be lower\n\n -->";

        String compRollPrompt = "\nComputer's dice: \n";

        String winPrompt = "\nYou guessed correctly.\n";
                winPrompt += "You Won!!";
        String losePrompt = "\nYour guess was incorrect\n";
                losePrompt += "You Lose!!";

        String gameEndPrompt = "\nGame Over!\n";
                gameEndPrompt += "Game terminating....";

        System.out.print(introPrompt);
        System.out.println(userDiceRollLine1);
        System.out.println(userDiceRollLine2);
        System.out.println(userDiceRollLine3);
        System.out.println(userDiceRollLine4);
        System.out.println(userDiceRollLine5);
        System.out.println(userDiceRollLine6);
        System.out.println(userDiceRollLine7);
        System.out.println(userDiceRollLine8);
        System.out.println("Your total: " + userTotal);
        System.out.println(compPlayingPrompt);
        System.out.print(userInputPrompt);

        String userInput = keyboard.nextLine().toUpperCase();

        boolean usrNumHigh = true;
       if (totalDiff < 0){
                usrNumHigh = false;
        }

        switch(userInput){
                case "H":
                case "HI":
                case "HIGHER":
                        System.out.println(compRollPrompt);
                        System.out.println(compDiceRollLine1);
                        System.out.println(compDiceRollLine2);
                        System.out.println(compDiceRollLine3);
                        System.out.println(compDiceRollLine4);
                        System.out.println(compDiceRollLine5);
                        System.out.println(compDiceRollLine6);
                        System.out.println(compDiceRollLine7);
                        System.out.println(compDiceRollLine8);
                        System.out.println("Computer total: " + compTotal);

                        if (usrNumHigh){
                                System.out.println(winPrompt);
                        }

                        else{
                                System.out.println(losePrompt);
                        }

                        System.out.println(gameEndPrompt);
                        break;

                case "L":
                case "LO":
                case "LOWER":
                        System.out.println(compRollPrompt);
                        System.out.println(compDiceRollLine1);
                        System.out.println(compDiceRollLine2);
                        System.out.println(compDiceRollLine3);
                        System.out.println(compDiceRollLine4);
                        System.out.println(compDiceRollLine5);
                        System.out.println(compDiceRollLine6);
                        System.out.println(compDiceRollLine7);
                        System.out.println(compDiceRollLine8);
                        System.out.println("Computer total: " + compTotal);
                        
                        if (usrNumHigh){
                                System.out.println(losePrompt);
                        }
                        else{
                                System.out.println(winPrompt);
                        }

                        System.out.println(gameEndPrompt);
                        break;

                default:
                        System.out.println("\nInvalid input!: ");
                        System.out.print ("Enter h/hi/higher for high "
                                + "and l/lo/lower for low.\n");
        }
    }

        static String selectDiceImg(int diceValue){
                
                String dice0 = """
                 _______
                /\\ o o o\

               /o \\ o o o\\_______
              <    >------>   o /|
               \\ o/  o   /_____/o|
                \\/______/     |oo|
                      |   o   |o/
                      |_______|/
                                """;

                String dice1 = """
               ._______.
               |       |\\
               |  ()   | |
               |       | |
               .-------. |
                \\      \\ |
                 \\______\\|
                     1
                                """; 

                String dice2 = """
               ._______.
               |()     |\\
               |       | |
               |     ()| |
               .-------. |
                \\      \\ |
                 \\______\\|
                      2
                                """;

                String dice3 = """
               ._______.
               |()     |\\
               |  ()   | |
               |     ()| |
               .-------. |
                \\      \\ |
                 \\______\\|
                      3
                                """;

                String dice4 = """
               ._______.
               |()   ()|\\
               |       | |
               |()   ()| |
               .-------. |
                \\      \\ |
                 \\______\\|
                      4
                                """;

                String dice5 = """
               ._______.
               |()   ()|\\
               |  ()   | |
               |()   ()| |
               .-------. |
                \\      \\ |
                 \\______\\|
                      5
                                """;

                String dice6 = """
               ._______.
               |()()() |\\
               |       | |
               | ()()()| |
               .-------. |
                \\      \\ |
                 \\______\\|
                      6
                                """;

                String out = "";
                switch(diceValue){
                        case 0:
                                out = dice0;
                                break;
                        case 1:
                                out = dice1;
                                break;
                        case 2:
                                out = dice2;
                                break;
                        case 3:
                                out = dice3;
                                break;
                        case 4:
                                out = dice4;
                                break;
                        case 5: 
                                out = dice5;
                                break;
                        case 6:
                                out = dice6;
                                break;
                }

                return out;
        }
}