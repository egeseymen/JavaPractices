/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author egese
 */
public class Account {
    private String name;
    private String password;
    private int balance;

    public Account(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }
    public void paraYatir(int investment){
        balance+=investment;
        System.out.println("Yeni bakiye:"+balance);
        
    }
    public void withdraw(int sum){
        if ((balance-sum)<0) {
            System.out.println("Have not enough money");
            
        }else{
            balance-=sum;
            System.out.println("New balance: "+balance);
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
}
