/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author egese
 */
public class Monitor {
    private String model;
    private String provider;
    private String dimension;
    private Resolution resolution;

    public Monitor(String model, String provider, String dimension, Resolution resolution) {
        this.model = model;
        this.provider = provider;
        this.dimension = dimension;
        this.resolution = resolution;
    }
    public void turnoffmonitor(){
        System.out.println("Monitor is turning off...");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
}
