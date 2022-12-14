/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author egese
 */
public class Manager extends Employee{
    private int numofpeopleresp;

    public Manager(String name, String surname, int id,int numofpeopleresp) {
        super(name, surname, id);
        this.numofpeopleresp=numofpeopleresp;
    }

    @Override
    public void showinformations() {
        super.showinformations(); 
        System.out.println("Manager is responsible "+numofpeopleresp+" people");
    }
    public void markup(int amountofraise){
        System.out.println("Employees salary was "+ amountofraise + "$ raised");
    }
}
