//Example for Stack class in Collections
import java.util.*;
class Stack_Example
{
    public static void main(String[] args){
        Stack<Integer> ll=new Stack();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        ll.pop();
        ll.remove(1);
        System.out.println(ll);
        //System.out.println(ll.remove(1));
        /*ll.addFirst(10);
        ll.addLast(90);*/
        System.out.println("Element value of index:"+ll.get(2));
        System.out.println("Array Position is:"+ll.indexOf(40));
        
    }
}