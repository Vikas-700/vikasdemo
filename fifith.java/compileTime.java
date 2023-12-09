// Function ower loding
/**
 * InnercompileTime
 */
 class Vikas {
    String name;
    int age;
public void info(String nmae){
    System.out.println("Your name is " +name);
}
public  void info(int age){
    System.out.println("Your Age is:"+age);
    return;
}
public void info(String name,int age){
    System.out.println("Your name Is " +name+" and your age is " +age);
    return;
}
    
}
public class compileTime {

    public static void main(String[] args) {
        Vikas v=new Vikas();
        v.name="Vikas kumar";
        v.age=70;
        v.info(v.age);
        v.info(v.name);
        v.info(v.name, v.age);
    }
}