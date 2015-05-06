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
public class Hero {
    
    private String name;
    private String type;
    private String currentSkill;
    private String[] skills;
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the skills
     */
    public String[] getSkills() {
        return skills;
    }

    /**
     * @param skills the skills to set
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    
    /**
     * @return the currentSkill
     */
    public String getCurrentSkill() {
        return currentSkill;
    }

    /**
     * @param currentSkill the currentSkill to set
     */
    public void setCurrentSkill(String currentSkill) {
        this.currentSkill = currentSkill;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    
    public void attack(String skill){
        System.out.println("Attacking with " + skill);
    }
    
    public void block(String skill){
        System.out.println("Blocking with " + skill);
    }

}
