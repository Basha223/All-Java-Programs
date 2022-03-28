//Example for DeQueue 
//Example for Stack class in Collections
import java.util.*;
class DeQueue_Example
{
    public static void main(String[] args){
        ArrayDeque<Integer> ll=new ArrayDeque();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.addFirst(10);
        ll.addLast(90);
        ll.removeFirst();
        ll.removeLast();
        //ll.remove(1);
        
        System.out.println(ll);
        //System.out.println(ll.remove(1));
        
       /* System.out.println("Element value of index:"+ll.get(2));
        System.out.println("Array Position is:"+ll.indexOf(20));*/
        
    }
}