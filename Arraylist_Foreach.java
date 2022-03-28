//Example for ArrayList for-each.
import java.util.*;
public class Arraylist_Foreach{
    public static void main(String[] args){
        ArrayList<String> emp=new ArrayList();
        emp.add("Basha");
        emp.add("Mca");
        emp.add("954049020");
        emp.add("y19mca020");
        emp.add("20.12");
        System.out.println("ArrayList size is:"+emp.size());
        System.out.println("The String elements are");
        for(String e:emp){//All for same String values
            System.out.println(e);
        }
    }
}