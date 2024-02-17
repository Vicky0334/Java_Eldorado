import java.util.*;
import java.util.ArrayList;

public class ArraylistExample {
public static void main(String[] args) {
    ArrayList<Integer>arrl=new ArrayList<Integer>();
    arrl.add(1);
    arrl.add(2);
    arrl.add(3);
    arrl.add(4);
    
    arrl.forEach(n->System.out.println(n));
    arrl.forEach(n->{if(n%2 == 0)System.out.println("evenNum:"+n);});

}
    
}