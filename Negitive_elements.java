//Write a JAVAprogram to print all negative elements in an array.
import java.util.Scanner;  
public class Negitive_elements
{  
public static void main(String[] args)   
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
  System.out.println("Negitive elements are:");
for (int i = 0; i < array.length; i++)
{
      if(array[i] < 0){
          System.out.println(array[i]);  
       
      }
    
    }
}  
}  