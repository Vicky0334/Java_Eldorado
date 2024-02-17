    import java.util.*;
import java.util.ArrayList;

public class ArraylistIterate {
public static void main(String[] args) {
    ArrayList<String>list=new ArrayList<String>();
    list.add("ravi");
    list.add("kuldeep");
    list.add("kumar");
    list.add("sanjeet");
    System.out.println("cdfgzddhcsbs");
    ListIterator<String>list1=list.listIterator(list.size());
    while (list1.hasPrevious()) {
        String str1=list1.previous();
        System.out.println(str1);
        
    }
    System.out.println("traversing list through for loop:");
    for(int i=0; i<list.size(); i++) {
        System.out.println(list.get(i));
    }

    System.out.println("traversing list through forEach()method;");
    list.forEach(a->{
        System.out.println(a);
    });

    System.out.println("traversing list through forEachRemaining()method");
    Iterator<String>itr=list.iterator();
    // lambdaExpression using
    itr.forEachRemaining(a->{
        System.out.println(a);
    });
}
}
//  Ways of
//by iterate interface
// by for-each loop
// by for loop
// forEach( ) method 
// forEachRemaininng() method
// iterating collection through remaining ways 