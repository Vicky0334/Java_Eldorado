import java.util.*;

public class Main1 implements Runnable{
Thread t;
Main1(){
    t= new Thread(this,"Admin Thread");
    t.setPriority(1);
    System.out.println("thread =0"+t);
    t.start();

}
public void run(){
    System.out.println("name = "+t.getName());

}
public static void main(String[] args) {
    new Main1();
}
}