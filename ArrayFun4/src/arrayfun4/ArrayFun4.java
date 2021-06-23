/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun4;

/**
 *
 * @author albert
 */
public class ArrayFun4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {3, 5, 2, 1, 10, 42};
        int sum = 0;
        
        for (int ctr = 0; ctr < numbers.length; ctr++) {
            sum += numbers[ctr];
            System.out.println("ctr = " + ctr + " current sum = " + sum);
        }
        System.out.println("Final sum: " + sum);
    }
    
}
