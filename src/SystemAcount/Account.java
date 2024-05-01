 
package SystemAcount;

public class Account {
   private int accountNo ;
   private String name; 
   private float amount;//rasid 

    public void insert(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }
    public void deposet(float amt){//inser in account
        this.amount=this.amount+amt;
        System.out.println(amt+" Depoited");
    }
     public void withdraw(float amt){
         if(amount<amt){  
             System.out.println("Insufficient balance");
         }else{
            this.amount=this.amount-amt;
        System.out.println(amt+" Withdrawn");  
         }
     }
     public void checkBalance (){
         System.out.println("Balance is "+this.amount);
         
     }   

    @Override
    public String toString() {
        return "Account{" + "accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + '}';
    }
     
       
    
   
   
    
}
