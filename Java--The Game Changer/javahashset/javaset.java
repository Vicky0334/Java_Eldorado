import java.util.*;
 class HashSet1{
        public static void main(String[]args){
        HashSet<String>Set=new HashSet();
        Set.add("one");
        Set.add("two");
        Set.add("three");
        Set.add("four");
        Iterator<String>ite=Set.iterator();
        while(ite.hasNext()){
          System.out.println(ite.next());
        }

    }
}