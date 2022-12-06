/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author egese
 */
public class Main {
    
    public static void main(String[] args) {
        
        ATM atm=new ATM();
        
        Account account=new Account("Ege Seymen", "12345", 2000);
        
        
        atm.initialize(account);
        
       
    }
}
