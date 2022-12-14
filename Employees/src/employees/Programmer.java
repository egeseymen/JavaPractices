/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author egese
 */
public class Programmer extends Employee{

    private String languages;
    
    public Programmer(String name, String surname, int id,String languages) {
        super(name, surname, id);
        this.languages=languages;
    }
    public void format(String operating_sistem){
        System.out.println(getName()+" is downloading "+operating_sistem);
    }

    @Override
    public void showinformations() {
        super.showinformations(); 
        System.out.println("Programmer knows "+languages+" languages.");
    }
    
}
