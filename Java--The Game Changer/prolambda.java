import java.util.*; 
 
 interface Inter1 {
    
    abstract void add(int a,int b);
    // abstract void sub(int a,int b);
}

public class prolambda {
    public static void main(String[] args) {

     Inter1 in = (a,b) -> System.out.println("sum is :"+(a+b));
     in.add(10,30);
    //  in.sub(28,30);
    
    }
}