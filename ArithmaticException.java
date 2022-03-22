//exmpale of ArithmaticExecption
import java.util.*;
public class ArithmaticException{
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=s.nextInt();
        System.out.print("Enter b value:");
        int b=s.nextInt();
        int c=a/b;
        System.out.println(c);
    }
}
