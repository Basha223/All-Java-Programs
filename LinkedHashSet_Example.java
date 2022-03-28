//Example for LinkedHashSet_Example
import java.util.*;
class LinkedHashSet_Example{
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs=new LinkedHashSet();
        lhs.add(10);
        lhs.add(120);
        lhs.add(67);
        lhs.add(40);
        lhs.add(67);
        lhs.add(null);
        lhs.add(null);
        System.out.println("It supports one null value and follow's the insertion order.dnt supports duplicates");
        System.out.println(lhs);
        }
}