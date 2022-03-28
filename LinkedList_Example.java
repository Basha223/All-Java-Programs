//Example for Linked list class in Collections
import java.util.*;
class LinkedList_Example
{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.addFirst(10);
        ll.addLast(90);
        System.out.println(ll);
        
    }
}