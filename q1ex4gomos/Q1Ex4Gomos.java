/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex4gomos;

/**
 *
 * @author TAU
 */
public class Q1Ex4Gomos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Your own class instances
       Person Bobby = new Person ("Bobby");
       Person Billy = new Person ("Billy");
       Person Jack = new Person ("Jack");
       
       //song class instances
       Song Song1 = new Song ("The Table is falling", "Boiler Room", "Rock", 4.32, 190);
       Song Song2 = new Song ("Girlfriend Havers", "Mr. Guidotti", "Pop", 3.47, 163);
       
       //singer instances
       Singer Singer1 = new Singer ("Mr. Bean", 0, 0, Song1);
       
       System.out.println("Hi! I am the singer "+ Singer1.name+ ". I have done "+Singer1.noOfPerformances+ " performance(s). I have earned a total of "+Singer1.earnings+". and my favorite song is "+Singer1.favoriteSong.name+". \n");
       
       Singer1.performForAudience(12);
       Singer1.changeFavSong(Song2);
       
       System.out.println("Hi! I am the singer "+ Singer1.name+ ". I have done "+Singer1.noOfPerformances+ " performance(s). I have earned a total of "+Singer1.earnings+". and my favorite song is "+Singer1.favoriteSong.name+". \n");
    }
    }
    
}
