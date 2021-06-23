/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun5;

/**
 *
 * @author albert
 */
public class ArrayFun5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {3, 5, 2, 1, 10, 42};
        //start at last index, go to first (0)
        for (int ctr = numbers.length -1; ctr >= 0; ctr--) {
            if (ctr % 2 == 1) {
                System.out.println("index " + ctr + " - " + numbers[ctr]);
            }
        }
    }
    
}
