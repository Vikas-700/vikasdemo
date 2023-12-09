import java.util.Scanner;

public class fac {
    public static void fact(long n){
        long facto=1;
        for(long i=n; i>=1; i--)
        {
            facto*=i;
        }
            System.out.println("Factorial:"+facto);
            return;
    }
    public static void main(String arg[]){
        System.out.print("Enter number:");
        Scanner vk=new Scanner(System.in);
        int n=vk.nextInt();
        vk.close();
       fact(n); 
    }   

}
