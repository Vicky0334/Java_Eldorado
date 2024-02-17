 import java.util.*;
 
 interface funcInterface {
    void abstractFun(int x);
    // bina default ke programm nhi chalega. 
    // it is complsary to write default.
    //only for interface.
   default  void normalFun(){
        System.out.println("hello");
    }
}
class Test{
    public static void main(String[] args) {
        funcInterface fobj=(int x)->System.out.println(2*x);
        fobj.abstractFun(5);
        fobj.normalFun();
        
}
}