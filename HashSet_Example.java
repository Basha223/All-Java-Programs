//Exmple for Hashset
import java.util.*;
class HashSet_Example{
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(null);
        hs.add(null);
        System.out.println("It not follow the ordered list");
        System.out.println(hs);
        }
}