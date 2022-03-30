/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
import java.util.*;
class ArithmeticException {

    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=s.nextInt();
        System.out.print("Enter b value:");
        int b=s.nextInt();
        int c=a/b;
        System.out.println(c);

    }
}
//"When ArithmeticException will occur in this program?"
//Answer is:when a number is divids by Zero,then the time ArithmaticException will Occur.