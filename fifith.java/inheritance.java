// import Invertis.Student;

// import Invertis.Student;

class Student{
    public  void sumOfNumber(int x,int y){
        System.out.println("Addition:"+(x+y));
    }
    public void subtarction(int x,int y){
        System.out.println("Subtraction:"+(x-y));
    }
// class Student extends Invertis
// {
    // public void Multiplication(int x,int y){
        // System.out.println("Multiplication:"+(x*y));
    // }
// }    
}
class inheritance extends Student {
   
        public void MultiPly(int x,int y){
         System.out.println("Multiplication:"+(x*y));
     }
      public static void main(String[] args) {
        inheritance obj= new inheritance();
        obj.sumOfNumber(3,5);
        obj.MultiPly(5,9);
    }
}
