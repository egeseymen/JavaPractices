/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınheritancepart1;

/**
 *
 * @author egese
 */
public class Manager extends Employee{ //subclass
    private int personincharge;
    public Manager(String name,int salary,String department,int personincharge){
        super(name, salary, department);
        this.personincharge=personincharge;
    }
    public void markup(int amountofraise){
        System.out.println("Employees salart was "+ amountofraise + "$ raised");
    }
    public void showinformations(){
        /*System.out.println("Name:"+getName());
        System.out.println("Salary:"+getSalary());
        System.out.println("Department:"+getDepartment());*/
        super.showinformations();
        System.out.println("number of people responsible:"+personincharge);
    }
}
