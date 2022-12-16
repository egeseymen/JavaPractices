/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author egese
 */
public class Computer {
    private Monitor monitor;
    private Computerbox computerbox;
    private Motherboard motherboard;

    public Computer(Monitor monitor, Computerbox computerbox, Motherboard motherboard) {
        this.monitor = monitor;
        this.computerbox = computerbox;
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Computerbox getComputerbox() {
        return computerbox;
    }

    public void setComputerbox(Computerbox computerbox) {
        this.computerbox = computerbox;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    
}
