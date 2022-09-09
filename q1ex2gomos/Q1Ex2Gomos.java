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
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome dear Player to higher or lower! What would you like to do? \n\n-Play a game\n-Settings\n-Quit the game.\n");
        String userChoice = sc.nextLine();
        System.out.print("(debug code dont mind) "+userChoice+"\n\n");
        switch(userChoice){
            case "Play a game":
            case "play a game":
            case "play game":
            case "Play game":
            case "Play":
            case "play":
                System.out.print("The game will now begin!");
                break;
            default:
                System.out.print("Not in the choices!");
                break;
        }
    }
    
}
