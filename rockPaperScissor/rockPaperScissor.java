/*
 * Purpose: To simulate Rock Paper Scissors game with one player and a computer
 * Author: Prashant Gupta
 * Date: November 7 2023 
 */

import java.util.*;
import javax.swing.*;

public class rockPaperScissor {
    
    public static void main(String[] args) {
        
        Random randGen = new Random();
        
        String [] choices = {"Rock", "Paper", "Scissor"};
        String [] gameDecision = {"Quit", "Start"};
        String [] continueGame = {"Next Round"};
        String [] results = {"See Results"};
        String [] okButton = {"Okay"};
        String [] finalButtons = {"Finish", "Play Again!"};
        
        String programStartTitle = "Rock, Paper, Scissors        P.Gupta";
        String welcomeMsg = "<html> <body align = center> <h1>Welcome!!</h1> "
                + "You'll be playing Rock Paper Scissors against me<h2>The "
                + "Mighty Computer</h2> </body> </html>";
        String gameInstr = "<html><h2>Instructions:</h2><br>i. You will play "
                + "the game against the computer<br>ii. You can quit the game "
                + "at any point<br>iii. The game will be a best of 3. Whoever "
                + "wins the most rounds will win</html>";
        String usrChoiceMsg = "<html><h2>Make Your Bet!!</h2></html>";
        String rockWins = "<html><h1>Rock crushes Scissors</h1></html>";
        String paperWins = "<html><h1>Paper wraps rock</h1></html>";
        String scissorWins = "<html><h1>Scissor cuts Paper</h1></html>";
        String winPrompt = "<html><br><h4>You WIN!</h4></html>";
        String compWinPrompt = "<html><br><h4>Computer Won!</h4></html>";
        String terminatePrompt = "<html><br>This is the end of the game.<br>"
                + "Press <b>Finish</b> to close the program.<br>Press <b>Play"
                + " Again!</b> to start the game over.</html>";
        
        final ImageIcon introImg = new ImageIcon("./img/RPS.png");
        final ImageIcon finalImg = new ImageIcon("./img/RPS2.png");
        final ImageIcon paperWinsImg = new ImageIcon(
                "./img/paperWrapsRock.png");
        final ImageIcon rockWinsImg = new ImageIcon(
                "./img/rockCrushScissor.png");
        final ImageIcon scissorWinsImg = new ImageIcon(
                "./img/scissorCutPaper.png");
        
        int usrWins = 0;
        int compWins = 0;
        int ties = 0;
        int rounds = 0;
        boolean keepPlaying = true;
        String[] buttons = {};

        JOptionPane.showOptionDialog(null,
                welcomeMsg, programStartTitle, 0, 
                1,introImg, gameDecision, gameDecision[1]);
        JOptionPane.showOptionDialog(null, gameInstr,
                "Introduction    P.Gupta", 0, 1,
                introImg, okButton, okButton[0]);

        while(keepPlaying){
            rounds++;
            if(rounds % 3 ==0 || rounds % 3 == 3){
                buttons = results;
            }
            else{
                buttons = continueGame;
            }

            int usrChoiceReprsnt = JOptionPane.showOptionDialog(
                        null,usrChoiceMsg, 
                        "Make Your Choice    P.Gupta", 0,
                        1, introImg,choices, null);
            int compChoiceReprsnt = randGen.nextInt(3);
                
            String usrChoice = TranslateChoice(usrChoiceReprsnt);
            String compChoice = TranslateChoice(compChoiceReprsnt);
                
            String roundLog = "<html>You chose: " + usrChoice + 
                        "<br>Computer Chose: " + compChoice + "<br></hmtl>";
            String tiePrompt = "<html><h4>You and the computer both chose"
                        + usrChoice + " </h4>" + "<h1>It's a tie</h1></html>";

            if(usrChoice == "Rock" && compChoice == "Paper"){
                JOptionPane.showOptionDialog(null,
                        roundLog + paperWins + compWinPrompt, 
                        programStartTitle, 0, 1,  
                        paperWinsImg, buttons, 
                        buttons[0]);
                compWins++;
            }
            else if(usrChoice == "Paper" && compChoice == "Rock"){
                JOptionPane.showOptionDialog(null,
                        roundLog + paperWins + winPrompt, 
                        programStartTitle, 0, 1,
                        paperWinsImg, buttons, 
                        buttons[0]);
                usrWins++;
            }
            else if(usrChoice == "Rock" && compChoice == "Scissor"){
                JOptionPane.showOptionDialog(null,
                        roundLog + rockWins + winPrompt, 
                        programStartTitle, 0, 1,
                        rockWinsImg, buttons, 
                        buttons[0]);
                usrWins ++;
            }
            else if(usrChoice == "Scissor" && compChoice == "Rock"){
                JOptionPane.showOptionDialog(null, 
                        roundLog + rockWins + compWinPrompt,
                        programStartTitle, 0, 1,
                        rockWinsImg, buttons,
                        buttons[0]);
                compWins++;
            }
            else if(usrChoice == "Paper" && compChoice == "Scissor"){
                JOptionPane.showOptionDialog(null, 
                        roundLog + scissorWins + compWinPrompt, 
                        programStartTitle, 0, 1,  
                        scissorWinsImg, buttons, 
                        buttons[0]);
                compWins++;
            }
            else if(usrChoice == "Scissor" && compChoice == "Paper"){
                JOptionPane.showOptionDialog(null, 
                        roundLog + scissorWins + winPrompt, 
                        programStartTitle, 0, 1,  
                        scissorWinsImg, buttons, 
                        buttons[0]);
                usrWins++;
            }
            else{
                JOptionPane.showOptionDialog(null, 
                        roundLog + tiePrompt, programStartTitle, 
                        0, 1,  finalImg, 
                        buttons, buttons[0]);
                ties++;
            }

            if(rounds % 3 == 0 || rounds % 3 == 3){
                String finalLog = "<html>You Won: " + usrWins + " times<br>"
                        + "Computer "
                        + "Won: " + compWins + " times<br>" + "Ties: " 
                        + ties + "</html>";
                if(usrWins > compWins){
                    finalLog += winPrompt;
                }
                else if(compWins > usrWins){
                    finalLog += compWinPrompt;
                }
                else{
                    finalLog += "<html><br><h1>It's a tie.</h1></html>";
                }    
                
                JOptionPane.showOptionDialog(null, 
                        finalLog, programStartTitle, 0,
                        1, finalImg, okButton, okButton[0]);
                int playAgain = JOptionPane.showOptionDialog(null,
                        terminatePrompt, "THE END!    P.Gupta",
                        0, 1, finalImg,
                        finalButtons, finalButtons[0]);
                if(playAgain == 0){
                    keepPlaying = false;
                }
            }
        }    
    }

    static String TranslateChoice(int choice){
        
        String translatedChoice = "";
        switch(choice){
            case 0:
                translatedChoice = "Rock";
                break;
            case 1:
                translatedChoice = "Paper";
                break;
            case 2:
                translatedChoice = "Scissor";
                break;
        }
        
        return translatedChoice;
    }
}
