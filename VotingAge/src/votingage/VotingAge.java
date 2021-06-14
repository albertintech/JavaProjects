/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingage;

/**
 *
 * @author albert
 */
public class VotingAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 19;
        String result = "";
        
        result = (age >= 18) ? "You can register!" : "You are not old "
                + "enough to vote";
        
        System.out.println(result);
    }
    
}
