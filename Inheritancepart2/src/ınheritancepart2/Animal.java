/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınheritancepart2;

/**
 *
 * @author egese
 */
public class Animal {
    private String name;
    private int weight;
    private int height;
    private int numoflegs;
    
    public Animal(String name,int weight,int height,int numoflegs){
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.numoflegs=numoflegs;
    }
    public void eat(){
        System.out.println("Animal is eating now...");
    }
    public void move(int speed){
        System.out.println("The animal is moving at "+speed);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the numoflegs
     */
    public int getNumoflegs() {
        return numoflegs;
    }

    /**
     * @param numoflegs the numoflegs to set
     */
    public void setNumoflegs(int numoflegs) {
        this.numoflegs = numoflegs;
    }
    
}
