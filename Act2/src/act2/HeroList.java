/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2;

/**
 *
 * @author USER
 */
public class HeroList {
    Hero[] h = new Hero[5];
            
    HeroList(){
        h[0].setName("Earthshaker");
        h[0].setType("Strength");
        h[0].setSkills(new String[] {"Fissure","Enchant Totem","Aftershock","Echo Slam"});
        h[0].setCurrentSkill(h[0].getSkills()[0]);
        
        h[1].setName("Kunkka");
        h[1].setType("Strength");
        h[1].setSkills(new String[] {"Torrent","X Marks The Spot","Tidebringer","Ghost Ship"});
        h[1].setCurrentSkill(h[1].getSkills()[0]);  
        
        h[2].setName("Weaver");
        h[2].setType("Agility");
        h[2].setSkills(new String[] {"Swarm","Shukuchi","Geminate Attack","Time Lapse"});
        h[2].setCurrentSkill(h[2].getSkills()[0]); 
        
        h[3].setName("Juggernaut");
        h[3].setType("Agility");
        h[3].setSkills(new String[] {"Blade Fury","Healing Ward","Blade Dance","Omnislash"});
        h[3].setCurrentSkill(h[3].getSkills()[0]);  
        
        h[4].setName("Storm Spirit");
        h[4].setType("Intelligence");
        h[4].setSkills(new String[] {"Static Remnant","Electric Vortex","Overload","Ball Lightning"});
        h[4].setCurrentSkill(h[4].getSkills()[0]);  
    }
}
