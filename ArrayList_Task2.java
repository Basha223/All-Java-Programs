//create a arralist and store fruit name and find whether the mango friut name is there or not.
import java.util.*;
public class ArrayList_Task2
{
    public static void main(String[] args){
        ArrayList<String> fruit=new ArrayList();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("mango");
        for(String f:fruit){
            if(f.equals("mango")){
                System.out.print("Mango is there in given Fruits");
            }
        }
    }
}