//Example for Vector class in Collections
import java.util.*;
class Vector_Example
{
    public static void main(String[] args){
        Vector<Integer> ll=new Vector();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        /*ll.addFirst(10);
        ll.addLast(90);*/
        System.out.println(ll.get(3));
        System.out.println(ll.indexOf(20));
        System.out.println(ll);
        
    }
}