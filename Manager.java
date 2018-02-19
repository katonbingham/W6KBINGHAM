/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nfl_draft;

/** Class: Manager
 * Summary: Creates 6 players, stores other data and methods
 * Author: Katon Bingham
 * Date: 2/11/18
 *
 * All following work is my own. 
 * -Katon
 */

import java.util.*;

public class Manager {
    Manager(){}
    Manager(String newName, ArrayList<Player> newArrli){
        this.name = newName;
        this.arrli = newArrli;
    }   // difference between using this.variable and the player class approach?
    
    private String name = "Jane Manager"; 
    ArrayList<Player> arrli = new ArrayList<Player>();

    public void setName(String name) {
        this.name = name;
    }
    public void setArrli(ArrayList<Player> arrli) {
        this.arrli = arrli;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Player> getArrli() {
        return arrli;
    }
    
    // creates six players. May need to be PlayerArray?.
    
    public ArrayList createPlayers() {
        Player p1 = new OffensivePlayer();
        Player p2 = new OffensivePlayer();
        Player p3 = new OffensivePlayer();
        Player p4 = new DefensivePlayer();
        Player p5 = new DefensivePlayer();
        Player p6 = new DefensivePlayer();
        
        arrli.add(p1);
        arrli.add(p2);
        arrli.add(p3);
        arrli.add(p4);
        arrli.add(p5);
        arrli.add(p6);
        
        return arrli;
    }
    
    @Override
    public String toString() {
        return "Manager{" + "name=" + name + ", arrli=" + arrli + '}';
    }
}
