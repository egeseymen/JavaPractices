/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author egese
 */
public class Motherboard {
    private String model;
    private String producer;
    private int numofslots;
    private String operatingsistem;

    public Motherboard(String model, String producer, int numofslots, String operatingsistem) {
        this.model = model;
        this.producer = producer;
        this.numofslots = numofslots;
        this.operatingsistem = operatingsistem;
    }
    public void downloadopsistem(String opsistem){
        this.operatingsistem=opsistem;
        System.out.println("Operating sistem was downloaded "+ opsistem);
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

    public int getNumofslots() {
        return numofslots;
    }

    public void setNumofslots(int numofslots) {
        this.numofslots = numofslots;
    }

    public String getOperatingsistem() {
        return operatingsistem;
    }

    public void setOperatingsistem(String operatingsistem) {
        this.operatingsistem = operatingsistem;
    }
    
    
}
