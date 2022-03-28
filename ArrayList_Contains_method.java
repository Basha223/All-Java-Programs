//Example for ArrayList_Contains_method
import java.util.*;
class ArrayList_Contains_method{
    public static void main(String args[]){
        ArrayList el=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Elements ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            el.add(sc.next());
            
        }
        System.out.println("Search Element ");
        String ser=sc.next();
        if(el.equals("red"))
        System.out.println("It Is Found");
        else
        System.out.println("It Is not Found");
    }
}