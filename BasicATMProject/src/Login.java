
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author egese
 */
public class Login {
    public boolean Control(Account account){
            Scanner scanner=new Scanner(System.in);
            String ID;
            String password;
            
            System.out.println("ID: ");
            ID=scanner.nextLine();
            System.out.println("Parola: ");
            password=scanner.nextLine();
            
            if (account.getName().equals(ID) && account.getPassword().equals(password)) {
                return true;
            }
            
           return false;
        
    }
}
