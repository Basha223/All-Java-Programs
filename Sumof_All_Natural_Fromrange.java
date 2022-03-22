//Write a JAVAprogram to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class Sumof_All_Natural_Fromrange
{  
public static void main(String[] args)   
{  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit:");
    int num=sc.nextInt();
int i,sum = 0;  

for(i = 1; i <= num; ++i)  
{  
  
sum = sum + i;  
}  
System.out.println("Sum of First "+num+" Natural Numbers is = " + sum);  
}  
}  