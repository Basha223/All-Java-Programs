// Example for ArrayList_addall_method
import java.util.*;
class ArrayList_addall_method{
    public static void main(String args[]){
        ArrayList<Integer> al1=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Elements ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        
        for(int i=0;i<n;i++){
            al1.add(sc.nextInt());
            
        }
        
        }
        for(Integer print1:al1){
            System.out.println("Old Array lis:"+al1);
        ArrayList<Integer> al2=new ArrayList();
         al2.addAll(al1);
         //System.out.println(al2);
        /*Collections.reverse(al1);
        System.out.println(al1);
         //System.out.println(al2);*/
         for(Integer print:al2) 
            System.out.println("New array elements are:"+print);
             
         }
    }
    