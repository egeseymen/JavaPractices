/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınheritancepart2;

/**
 *
 * @author egese
 */
public class Dog extends Animal{
    private int numoftheeth;

    public Dog(String name, int weight, int height, int numoflegs,int numoftheeth) {
        super(name, weight, height, numoflegs);
        this.numoftheeth = numoftheeth;
    }
    public void move(int speed){
        System.out.println("The dog is moving at "+speed);
    }

    public void run(int speed){
        System.out.println("The dog is running");
        move(speed);
    }
    /**
     * @return the numoftheeth
     */
    public int getNumoftheeth() {
        return numoftheeth;
    }

    /**
     * @param numoftheeth the numoftheeth to set
     */
    public void setNumoftheeth(int numoftheeth) {
        this.numoftheeth = numoftheeth;
    }
    
    
}
