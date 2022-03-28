//Example for Treeset
import java.util.*;
class TreeSet_Example{
    public static void main (String[] args) {
     TreeSet<Integer> pq=new TreeSet();
        pq.add(10);
        pq.add(120);
        pq.add(67);
        pq.add(40);
        pq.add(67);
        //pq.add(null);
        //pq.add(null);
System.out.println("not supported null,supports dupliactes,Accept only  unique value at a time");
    System.out.println(pq);
}
}

