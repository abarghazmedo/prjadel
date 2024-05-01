/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SystemAcount;

public class Test {
    public static void main(String[] args) {
        
        Account a1=new Account();
        a1.insert(4451238, "Mohamed", 10000);
        a1.deposet(12000);//inser in account
        a1.withdraw(2000);
        a1.checkBalance();
        System.out.println(a1.toString());
        
        System.out.println("-------------------------------------");
           Account a2=new Account();
        a2.insert(5631145 , "Bilal", 100);
        a2.deposet(50);//inser in account
        a2.withdraw(140);
        a2.checkBalance();
        System.out.println(a2.toString());
        
         System.out.println("-------------------------------------");
           Account a3=new Account();
        a3.insert(4451238, "Ahmed", 500);
        a3.deposet(550);//inser in account
        a3.withdraw(10);
        a3.checkBalance();
        System.out.println(a3.toString());
        
    }
    
}
