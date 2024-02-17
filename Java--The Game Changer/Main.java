import java.util.*;

class hii extends Thread {
   public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hii");
            try{
                Thread.sleep(500);

            }
            catch(Exception e){
                System.out.println("expecting");

            }
        }
    }
}
class hello extends Thread  {
  public  void run (){
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(500);

            }
            catch(Exception e){
                System.out.println("expecting");

            }
        }
    }
}
    public class Main {
         public static void main(String[] args)   {
        hii obj3 = new hii();
        hello obj2 = new hello();
     obj3.start();
        obj2.start();
    }
    }
   
