//Example for Arraylist_Example1
import java.util.*;
public class Arraylist_Example1{
    public static void main(String[] args){
        ArrayList emp=new ArrayList();
        emp.add("Basha");
        emp.add("Mca");
        emp.add(954049020);
        emp.add("y19mca020");
        emp.add(20.12);
        System.out.println("ArrayList size is:"+emp.size());
        System.out.println(emp.get(4));
        for(int i=0;i<emp.size();i++){
            System.out.println(emp.get(i));
        }
        
        }
    }
