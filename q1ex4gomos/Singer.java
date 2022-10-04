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
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience (int AudienceNum) {
        noOfPerformances++;
        earnings = earnings + 100*AudienceNum;
        totalPerformances++;
    }
    public void performForAudience (Singer otherSinger, int AudienceNum) {
        noOfPerformances++;
        otherSinger.noOfPerformances++;
        earnings = earnings + 100*AudienceNum*0.5;
        otherSinger.earnings = otherSinger.earnings + 100*AudienceNum*0.5;
        totalPerformances = totalPerformances+2;
    }
    
    public void changeFavSong(Song NewFavoriteSong) {
        favoriteSong = NewFavoriteSong;
    }
    
    
    public String getName(){
        return name;
    }
    public int getnoOfPerformances(){
        return noOfPerformances;
    }
    public double getEarnings(){
        return earnings;
    }
    public Song getFavSong(){
        return favoriteSong;
    }
}
