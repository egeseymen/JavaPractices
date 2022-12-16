/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author egese
 */
public class Computerbox {
    private String model;
    private String producer;
    private String material;

    public Computerbox(String model, String producer, String material) {
        this.model = model;
        this.producer = producer;
        this.material = material;
    }
    public void turnoncomputer(){
        System.out.println("Computer is turning on...");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
