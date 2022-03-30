/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
class NumberFormatException 

{ 
    void test()
    {
        Scanner sc=new Scanner(System.in);
            int sum=0;
            System.out.println("Enter first number:");
            String num1=sc.next();
            
            System.out.println("Enter second number:");
            String num2=sc.next();
            
            System.out.println("Addtion of two Numbers is:");
             sum=num1+num2;
            System.out.println((sum));
    }
    public static void main(String args[]) throws Exception
    {
        NumberFormatException obj=new NumberFormatException();
        obj.test();
    }
    }
//"When NumberFormatException will occur in this program?"
//Answer:While adding String type numbers  to the integer type,then will seems NumberFormatException .
