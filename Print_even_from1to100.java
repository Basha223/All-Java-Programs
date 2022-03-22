//15.Write a JAVAprogram to print all even numbers between 1 to 100. - using while loop
import java.util.Scanner;  
public class Print_even_from1to100
{  
public static void main(String[] args)   
{  
int number, i;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
number = sc.nextInt();    
i=2;   
System.out.print("Lit of even numbers: ");  
while(i<=number)  
{  
 
System.out.print(i +" ");   
i=i+2;  
}     
}  
}