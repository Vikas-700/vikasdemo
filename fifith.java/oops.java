class Vikas {
String name;
int age;
public void printName(){
    System.out.println(name);
}
Vikas(int a,int b){
    System.out.println(a*b);
}   
}
public class oops {
public static void main(String args[]){
    Vikas vk=new Vikas(2,5);
    vk.name="Vikas Kumar";
    vk.printName();
}
    
}