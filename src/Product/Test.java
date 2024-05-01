
package Product;


public class Test {
    public static void main(String[] args) {
        //Product p1=new Product();
        Product p1=new Product("Ahmed", "hello", 12000, 3, 15,"red");
        Product p2=new Product(p1);//copy constructor by obbj in argement
        p2.display();
        System.out.println("---------------------------");
     
        
        
        
    }
    
}
