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
public class Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        // TODO code application logic here
        Hero h = new Hero();
        h.setName("Earthshaker");
        h.setType("Strength");
        h.setSkills(new String[] {"Fissure","Enchant Totem","Aftershock","Echo Slam"});
        h.setCurrentSkill(h.getSkills()[0]);
        String[] skills = h.getSkills();
        String[] menuItem={"---- "+ h.getName() +" ----",
                           "----- "+ h.getType() +" -----",
                           "1. Change Skill",
                           "2. Attack",
                           "3. Block",
                           "4. Display Skill List",
                           "5. Quit/End",
                           "------------------"};
        char ch='\u0000';
        while(ch!='5')
        {
            for(String s:menuItem) System.out.println(s);
            System.out.print("Enter Option: ");
            ch=new java.util.Scanner(System.in).nextLine().charAt(0);
            switch(ch)
            {
                case '1': System.out.println("Select Skill: ");
                        int count=1; 
                        for(String x:h.getSkills()){
                            System.out.println(count+". "+x);
                            count++;
                        }
                        int skill=new java.util.Scanner(System.in).nextInt();
                        h.setCurrentSkill(h.getSkills()[skill-1]);
                        System.out.println("Changed skill to " + h.getCurrentSkill());
                        break;
                case '2': h.attack(h.getCurrentSkill());
                        break;
                case '3': h.block(h.getCurrentSkill());
                        break;
                case '4': int ctr=1; 
                        for(String x:h.getSkills()){
                            System.out.println(ctr+". "+x);
                            ctr++;
                        }
                        break;
                case '5': System.out.println("Program Terminates");
            }
        }
    }
    
}//endofclass
