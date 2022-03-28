//Example for Sort method
import java.util.*;
class ArrayList_Sort_Method{
    public static void main(String args[]){
        ArrayList<Integer> el=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Elements ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        
        for(int i=0;i<n;i++){
            el.add(sc.nextInt());
            
        }
        Collections.sort(el);
        for(Integer s:el){
       System.out.println("Sorted list:"+s);
        }    
        
}
}
