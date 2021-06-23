/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodfun;

/**
 *
 * @author albert
 */
public class MethodFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 42;
        doIt(num);
        doIt(num);
        doIt(num);
    }
    
    public static void doIt(int x) {
        System.out.println("My number: " + x);
    }
}
