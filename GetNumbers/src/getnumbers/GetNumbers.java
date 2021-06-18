/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getnumbers;

/**
 *
 * @author albert
 */
public class GetNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        get2();
        int num = get3();
        System.out.println( get2() );
        System.out.println(num);
        System.out.println( get4() );
    }
    
    public static int get2() {
        return 2;
    }
    public static int get3() {
        return 3;
    }
    public static int get4() {
        return 4;
    }
}
