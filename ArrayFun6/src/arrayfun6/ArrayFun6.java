/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun6;

/**
 *
 * @author albert
 */
public class ArrayFun6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < numbers.length - 2; i += 3) {
            System.out.println("Pair: (" + numbers[i] + ", "
            + numbers[i + 1] + ")");
        }
    }
    
}
