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
public class GrassType extends SimpleMonster{
    
    public GrassType(String name, int HP, int base) {
    this.name = name;
    this.type = "grass";
    this.strongAgainst = "water";
    weakAgainst = "fire";
    this.maxHP = HP;
    this.hp = HP;
    this.atk = base;
    this.def = base;
    monsterList.add(this); 
    
}   
    public void rest() {
    this.hp += maxHP*0.5;
}
    @Override
     public void special(){
        this.hp = (int) (this.hp + maxHP*0.2);
    }
}
