/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınheritancepart1;

/**
 *
 * @author egese
 */
public class Employee  { //super class or base class
    private String name;
    private int salary;
    private String department;
    
    public Employee(String name,int salary,String department){
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    
    public void work(){
        System.out.println("Employee is working now...");
    }
    public void showinformations(){
        System.out.println("Name:"+getName());
        System.out.println("Salary:"+getSalary());
        System.out.println("Department:"+getDepartment());
    }
    public void changedepartment(String newdepartment){
        System.out.println("Department is changing");
        setDepartment(newdepartment);
        System.out.println("Newdepartment of "+getName()+" employee is "+newdepartment);
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
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
}
