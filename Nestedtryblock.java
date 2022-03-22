// Example for Nestedtryblock
import java.util.*;
class Nestedtryblock{
    public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a value:");
    int a=sc.nextInt();
    System.out.print("Enter b value:");
    int b=sc.nextInt();
    int ab[]={1,3,4};
    try {
        System.out.println("Outer block Exicuted");
        System.out.println("Value of Division:"+(a/b));
        
        try{
            
            System.out.println("New Array Element:"+(ab[5]));
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
