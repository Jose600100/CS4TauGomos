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
public class Song {
    private String name, author, genre;
    private double length;
    private int bpm;
    
    public Song(String name, String author, String genre, double length, int bpm) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.length = length;
        this.bpm = bpm;
    }
    
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public double getlength(){
        return length;
    }
    public int getbpm(){
        return bpm;
    }
}
