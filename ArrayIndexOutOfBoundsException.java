/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
public class ArrayIndexOutOfBoundsException 
{
    public static void main(String args[]) 
    {
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of the array: "); 
        for(int i=0; i<n; i++)
        { 
            array[i]=sc.nextInt();  
            
        }
        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
            System.out.println(array[i]);
        }  
       // System.out.print(array[5]);/*when n=3;if you exicute this, you will seems ArrayIndexOutOfBoundsException */
    }
}

//When ArrayIndexOutOfBoundsException occur in this program?
//Answer:whenever we are trying to access any item of an array at an index which is not present in the array then it will raise ArrayIndexOutOfBoundsException.