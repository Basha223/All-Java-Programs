//Array input from the user
import java.util.Scanner;
class Exercise3{
    public static void main(String[] args){
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter Elements :");  
            for(int i=0;i<=5;i++)
            {
            a[i]=sc.nextInt();
           
            }
          
        System.out.println("Elements are :");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}