import java.util.*;
import java.util.ArrayList;

public class ArrylistRemainingExample {
public static void main(String[] args) {
    ArrayList<Integer>arrl=new ArrayList<Integer>();
    arrl.add(1);
    arrl.add(2);
    arrl.add(3);
    arrl.add(4);

    arrl.forEach(n->System.out.println(n));
    arrl.removeIf(n->(n%3 == 0));
    arrl.forEach(n->System.out.println("removelIfKeBad: "+n));
    //OR

//    for(int i:arrl){
//     System.out.println(i);
//    }

}
    
}