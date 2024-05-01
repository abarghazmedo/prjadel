
package passingobjectToMethod;

public class main {
    static void fun(int n){
        n++;
    }
    
    
    public static void main(String[] args) {
        int numbre=1;
        fun(numbre);
        System.out.println("numbre = "+numbre);
        
    }
    
}
