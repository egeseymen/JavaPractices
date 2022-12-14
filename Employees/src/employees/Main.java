/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

import java.util.Scanner;

/**
 *
 * @author egese
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome Employees Program");
        
        String operations="Operations...\n"
                        +"1. Programmer operations...\n"
                        +"2. Manager operations...\n"
                        +"Press q for exit...\n";
        System.out.println("*********************************");
        System.out.println(operations);
        System.out.println("*********************************");
        

        while (true) {            
            System.out.println("Please select operations");
            String islem=scanner.nextLine();
            
            if (islem.equals("q")) {
                break;
            }else if (islem.equals("1")) {
                Programmer programmer=new Programmer("İsmail Ege", "Seymen", 1, "C#,Java,JavaScript,CSS,HTML");
                String programmer_operations="1. Format a Computer\n"
                                            +"2. Show Info\n"
                                            +"3. Press q for exit programmer operations";
                System.out.println(programmer_operations);
                while (true) {                    
                    System.out.println("Select an operation");
                    String programmer_op=scanner.nextLine();
                    if (programmer_op.equals("q")) {
                        System.out.println("Exiting programmer operations");
                        break;
                    }else if (programmer_op.equals("1")) {
                        System.out.println("Operating System:");
                        String opsis=scanner.nextLine();
                        programmer.format(opsis);
                    }else if (programmer_op.equals("2")) {
                        programmer.showinformations();
                    }else{
                        System.out.println("You entered an invalid operation!!!");
                    }
                }
            }else if (islem.equals("2")) {
                Manager manager=new Manager("Ali", "Seymen", 1, 10);
                String manager_operations="Manager Operations\n"
                                          +"1. Markup\n"
                                          +"2. Show Informations\n"
                                          +"3. Press q for exit programmer operations";
                System.out.println(manager_operations);
                while (true) {                    
                    System.out.println("Select an operation");
                    String manager_op=scanner.nextLine();
                    if (manager_op.equals("q")) {
                        break;
                    }else if (manager_op.equals("1")) {
                        System.out.println("How much money do you want the manager to markup?");
                        int markup=scanner.nextInt();
                        scanner.nextLine();
                        manager.markup(markup);
                    }else if (manager_op.equals("2")) {
                        manager.showinformations();
                    }else{
                        System.out.println("You entered an invalid operation!!!");
                    }
                    
                }

            }else{
                System.out.println("You entered an invalid operation!!!");
            }
            
        }
    }
}
