// Example for ArithmaticExceptionHandling\    
import java.util.*;
class ArithmaticExceptionHandling{
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=s.nextInt();
        System.out.print("Enter b value:");
        int b=s.nextInt();
        
        try{
            int c=a/b;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Entered value of a is:"+a);
        System.out.println("Entered value of b is:"+b);

    }
}
            
