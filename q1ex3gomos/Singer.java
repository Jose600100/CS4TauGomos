/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex3gomos;

/**
 *
 * @author TAU
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience (int AudienceNum) {
        noOfPerformances++;
        earnings = earnings + 100*AudienceNum;
    }
    
    public void changeFavSong(Song NewFavoriteSong) {
        favoriteSong = NewFavoriteSong;
    }
}
