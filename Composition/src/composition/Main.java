/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

/**
 *
 * @author egese
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resolution resolution=new Resolution(1920, 1080);
        Monitor monitor=new Monitor("VS197DE", "ASUS", "18.5inc", resolution);
        Computerbox computerbox=new Computerbox("ShadowBlade", "Shadow", "Glass");
        Motherboard motherboard=new Motherboard("B250-PRO", "ASUS", 10, "WINDOWS10");
        Computer computer=new Computer(monitor, computerbox, motherboard);
        
        computer.getComputerbox().turnoncomputer();
        computer.getMonitor().turnoffmonitor();
        computer.getMotherboard().downloadopsistem("UBUNTU");
    }
    
}
