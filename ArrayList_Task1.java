//Create a Arraylist stroring 10 integers and find maximum element fro that arraylist.
import java.util.*;
import java.util.Collections;
class ArrayList_Task1{
    public static void main(String[] args){
        ArrayList<Integer> emp=new ArrayList();
        emp.add(11);
        emp.add(12);
        emp.add(13);
        emp.add(10);
        emp.add(9);
        emp.add(14);
        emp.add(18);
        emp.add(20);
        emp.add(21);
        System.out.println("The size of ArrayList:"+emp.size());
       // System.out.print("Max value from an Arraylist:"+Collections.max(emp));
       int n=emp.size();
       int max=emp.get(0);
       System.out.println(max);
       
      for(int i=0;i<n;i++)
        {
            if(emp.get(i)>max)
            {
                max=emp.get(i);
                
            }
            
        }
        System.out.println("max is:"+max);
    }
}