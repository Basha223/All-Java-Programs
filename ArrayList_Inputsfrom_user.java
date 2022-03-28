// Example for ArrayList_Inputsfrom_user
import java.util.*;
class ArrayList_Inputsfrom_user{
    public static void main(String[] args){
        ArrayList<Integer> data=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Elements you want: ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            data.add(sc.nextInt());
        }
        for(Integer s:data){
            System.out.println("Elements are:"+s);
        }
        
    }
}