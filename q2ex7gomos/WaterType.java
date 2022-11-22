/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2ex7gomos;

/**
 *
 * @author TAU
 */
public class WaterType extends SimpleMonster{
    
    public WaterType(String name, int HP, int base) {
    this.name = name;
    this.type = "water";
    this.strongAgainst = "fire";
    weakAgainst = "grass";
    this.maxHP = HP;
    this.hp = HP;
    this.atk = (int) (0.7*base);
    this.def = (int) (1.3*base);
    monsterList.add(this); 
    
}
    @Override
     public void special(){
        this.def +=2;
        this.hp = (int) (this.hp - maxHP*0.1);
    }
}