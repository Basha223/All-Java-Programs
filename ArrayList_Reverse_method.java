// Example for ArrayList_Reverse_method
import java.util.*;
class ArrayList_Reverse_method{
    public static void main(String args[]){
        ArrayList<Integer> rev=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Elements ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        
        for(int i=0;i<n;i++){
            rev.add(sc.nextInt());
            
        }
        ArrayList<Integer> rev1=new ArrayList();
         rev.addAll(rev1);
        Collections.reverse(rev);
        for(Integer re:rev){
        System.out.println("Reverse numbers are:"+re);
        }
         }
    }
    