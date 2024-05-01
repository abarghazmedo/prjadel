
package staticKyword;

public class Student {
    int no;
    private String name;   
    private String password;
    private boolean loggedIn;
    private static int minimalPasswordLength=6;
    private static int count=1;//if use this static he work count all nem   
    private static String college="Ipernet";

    public Student( String name,String password) {
        this.no = count;
        this.name = name;  
        this.password=password;
        count++;
    }
    
         //System.out.println(student1.login(1, "123"));
    public boolean login (int entreNo,String entrePassword){
        if (entreNo==no&&entrePassword.equals(password)){
            loggedIn=true;
        }else {
            return false;
        }
        return true;
    }
    
    public static boolean validationPassword(String password){
        if (password.length() >= minimalPasswordLength){
        return true;
    }
    return false;
}

    @Override
    public String toString() {
        return "Student{" + "no=" + no + ", name=" + name + '}';
    }
//    we have static variable 
//            static method 
//            static block
//            static class        
            

    
    
    
}
