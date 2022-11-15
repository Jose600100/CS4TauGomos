/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2ex6gomos;

/**
 *
 * @author TAU
 */
public class Q2Ex6Gomos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean fight = true;
        FireType f1 = new FireType("Hottea", 100, 20);
        GrassType f2 = new GrassType("Lleehf", 100, 20); 
        WaterType f3 = new WaterType("Wattyr", 100, 20); 
        
        while (fight==true) {
            //to do: fix fightend to proc immediately after a faint
            f1.attack(f2);
            f2.attack(f3);
            f3.attack(f1);
            if (f1.getHP()==0 || f2.getHP()==0 || f3.getHP()==0){
                fight=false;
            }
        }
    }
    
}
