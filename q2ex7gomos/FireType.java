/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2ex7gomos;

public class FireType extends SimpleMonster{
    
    public FireType(String name, int HP, int base) {
    this.name = name;
    this.type = "fire";
    this.strongAgainst = "grass";
    weakAgainst = "water";
    this.maxHP = HP;
    this.hp = HP;
    this.atk = (int) (1.3*base);
    this.def = (int) (0.7*base);
    monsterList.add(this); 
    
}
    @Override
     public void special(){
        this.atk +=2;
        this.hp = (int) (this.hp - maxHP*0.1);
    }
}
