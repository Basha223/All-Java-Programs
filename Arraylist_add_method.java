//Example for Arraylist add() method for storing data from user
import java.util.*;
class Arraylist_add_method
{
public static void main(String args[])
{
ArrayList<Integer> al=new ArrayList();
Scanner sc=new Scanner(System.in);
for(int i=0;i<2;i++){
System.out.println("enter a value");
al.add(sc.nextInt());
}
for(Integer n:al)
{
   
System.out.println("Values are:"+n);
}
}
}
