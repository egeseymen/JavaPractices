/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author egese
 */
public class Test {
    public static void main(String[] args) {
        Account account1=new Account();
        Account account2=new Account("Ahmet Can","example@gmail.com","98990889");
        
        account1.bilgilerigoster();
        account2.bilgilerigoster();
        
    }
}
