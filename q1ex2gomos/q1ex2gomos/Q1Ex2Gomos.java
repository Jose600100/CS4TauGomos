/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2gomos;
import java.util.Scanner;
/**
 *
 * @author TAU
 */
public class Q1Ex2Gomos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean gameon = false;
        Scanner sc = new Scanner(System.in);
        int range = 10;
        int min = 1;
        int max = 0;
        
        while (gameon == false) {
        System.out.print("\nWelcome dear Player to higher or lower! What would you like to do? \n\n-Play a game\n-Settings\n-Quit the game.\n");
        String userChoice = sc.nextLine();
        System.out.print("(debug code dont mind) "+userChoice+"\n\n");
        
            switch(userChoice){
                //when the user chooses to play a game
                case "Play a game":
                case "play a game":
                case "play game":
                case "Play game":
                case "Play":
                case "play":
                    System.out.print("The game will now begin!\n\n");
                    int guessCount = 3;
                    boolean gamewon = false;
                    int random = (int) Math.floor(Math.random()*range) + min;
                    
                    while (guessCount > 0) {
                        System.out.print("You have "+guessCount+" guess(es) left, What is your guess? ");
                        
                        String userGuess = sc.nextLine();
                        int userNumber = Integer.parseInt(userGuess);
                    
                        if (userNumber < random){
                            System.out.print("guess higher! ");
                            guessCount--;
                        }
                        else if (userNumber > random){
                            System.out.print("guess lower! ");
                            guessCount--;
                        }
                        else if (userNumber == random){
                            System.out.print("You guessed the right number, and won the game!\n");
                            gamewon = true;
                            break;
                        }
                    }
                    if (gamewon == false){
                        System.out.print("You have lost the game!\n");
                    }
                    
                    System.out.print("Would you like to play again? ");
                    String userplayagain = sc.nextLine();
                    switch (userplayagain) {
                        case "No":
                        case "no":
                        case "n":
                        case "N":
                            gameon = true;
                            break;
                        case "Yes":
                        case "yes":
                        case "Y":
                        case "y":
                          break;
                        }
                break;
                //when the user chooses to change the settings
                case "Settings":
                case "settings":
                case "Setting":
                case "setting":
                    System.out.print("\nWhat is the upper limit of the random number? ");
                    String usermax = sc.nextLine();
                    max = Integer.parseInt(usermax);
                    
                    System.out.print("\nWhat is the lower limit of the random number? ");
                    String usermin = sc.nextLine();
                    min = Integer.parseInt(usermin);
                    
                    range = max - min;
                    break;
                
                case "Quit the game":
                case "quit the game":
                case "Quit game":
                case "quit game":
                case "Quit":
                case "quit":
                    gameon = true;
                    break;
                    
                default:
                    System.out.print("Not in the choices!");
                break;
        }
     }
        System.out.print("\nThank you for playing!");
    
}
}