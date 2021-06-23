/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun;

/**
 *
 * @author albert
 */
public class ArrayFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ourNumber = 0;
        int[] numbers = new int[]{3,5,2,0};
        
        System.out.println("Our Numbers: ");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println("ourNumber: " + ourNumber);
        
        numbers[1] = 9;
        ourNumber = numbers[0];
        
        System.out.println("Our Numbers Now: ");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println("ourNumber: " + ourNumber);
    }
    
}
