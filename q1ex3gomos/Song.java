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
public class Song {
    String name, author, genre;
    double length;
    int bpm;
    
    public Song(String name, String author, String genre, double length, int bpm) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.length = length;
        this.bpm = bpm;
    }
}
