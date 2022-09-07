/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1gomos;

/**
 *
 * @author TAU
 */
public class Q1Ex1Gomos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String weapon1 = "Sword";
        String weapon2 = "Spear";
        String weapon3 = "Shield";
        String dmgtype1 = "slashing";
        String dmgtype2 = "piercing";
        String dmgtype3 = "blunt";
        int dmg1 = 10;
        int dmg2 = 7;
        int dmg3 = 1;
        int dmgsum = dmg1 + dmg2 + dmg3;
        boolean compare1and2 = dmg1 < dmg2;
        
        System.out.println("Welcome to the armory, my Lord. Home of the finest weapons the kingdom has to offer.");
        System.out.println("Here is what we have for you today:");
        System.out.println("");
        System.out.println("The first weapon is a "+weapon1+" .");
        System.out.println("It is of the "+dmgtype1+" type.");
        System.out.println("And it does "+dmg1+" damage.");
        System.out.println("");
        System.out.println("The second weapon is a "+weapon2+" .");
        System.out.println("It is of the "+dmgtype2+" type.");
        System.out.println("And it does "+dmg2+" damage.");
        System.out.println("");
        System.out.println("The third and final weapon is a "+weapon3+" .");
        System.out.println("It is of the "+dmgtype3+" type.");
        System.out.println("And it does "+dmg3+" damage.");
    }
    
}
