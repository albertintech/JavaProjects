/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author albert
 */
public class Dog {

    /**
     * @param args the command line arguments
     */
    private String name;
    private double weight;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void bark(){
        System.out.println("WOOF!");
    }
    
    public void sit(){
        System.out.println("Sitting...");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog buster = new Dog();

        buster.setName("Buster");
        buster.setWeight(15.5);
        
        System.out.println(buster.getName());
        System.out.println(buster.getWeight());
        
        buster.bark();
        buster.sit();
    }
    
    
    
}
