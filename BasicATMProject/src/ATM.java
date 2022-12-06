
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author egese
 */
public class ATM {
    public void initialize(Account account){
        Login login=new Login();
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Welcome to ATM");
        
        System.out.println("******************************");
        System.out.println("Login");
        System.out.println("******************************");
        int maxentree=3;
        
        while (true) {            
            if (login.Control(account)) {
                System.out.println("Success login...");
                break;
            }
            else{
                System.out.println("Unsuccessful login...");
                maxentree--;
                System.out.println("You have "+maxentree+" entry!");
            }
            if (maxentree==0){
                System.out.println("Your login has expired!");
                return;
                
            }
        }
        System.out.println("******************************");
        String operations="1. Show my balance\n"
                          +"2. Invest money\n "
                          +"3. Withdraw money\n"
                          +"4. Exit";
        System.out.println(operations);
        System.out.println("******************************");
         while (true) {            
             System.out.println("Select an operation");
             String operation=scanner.nextLine();
             
             if (operation.equals("4")) {
                 break;
             }else if (operation.equals("1")) {
                 System.out.println("Your balance: "+account.getBalance());
             }else if (operation.equals("2")) {
                 System.out.println("How much money would you like to invest: ");
                 int investment=scanner.nextInt();
                 scanner.nextLine();
                 account.paraYatir(investment);
             }else if (operation.equals("3")) {
                 System.out.println("How much money would you like to withdraw:");
                 int sum=scanner.nextInt();
                 scanner.nextLine();
                 account.withdraw(sum);                  
             }else{
                 System.out.println("invalid operation!!");
             }
        }
        
        
    }
}
