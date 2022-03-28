/* Write a Java program to count the number of key-value (size) mappings in a map. 
Prompt the user input from the terminal.

Sample Input: 
Enter value:20
Enter key:bitLabs
Enter another student (y/n)?y
Enter value:25
Enter key:welcomes
Enter another student (y/n)?y
Enter value:30 
Enter key:you
Enter another student (y/n)?n

Expected Output: The size of the map is 3 */ 
import java.util.*;
class HashMap_Key_ValueSize_Collection{
    public static void main(String args[]){
   HashMap<Integer,String> hm=new HashMap();
     boolean val=true;
     Scanner sc=new Scanner(System.in);
     do
     {
         System.out.print("Enter  Value :");
         Integer value=Integer.parseInt(sc.nextLine());
         System.out.print("Enter the Key :");
         String key= sc.nextLine();
         
         String data=hm.put(value,key); 
         System.out.print("Enter Another Student (y/n)? ");
         String choice=sc.nextLine();
         if(choice.equals("y")){
             continue;
         }
          else{
              break;
          }
         
     }
     while(val);
     System.out.print("The size of the Map is :"+hm.size());
    }
}