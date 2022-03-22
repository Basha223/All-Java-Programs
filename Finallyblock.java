//Example for Finally block
import java.util.*;
class Finallyblock{
    public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a value:");
    int a=sc.nextInt();
    System.out.print("Enter b value:");
    int b=sc.nextInt();
    int ab[]={1,3,4};
    try{
        System.out.println("value:"+a/b);
    }catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("Deafult its Prints either Exception is handled or not");
    }
}
}
