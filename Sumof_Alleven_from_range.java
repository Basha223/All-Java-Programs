//Write a JAVAprogram to find sum of all even numbers between 1 to n.
import java.util.Scanner;

public class Sumof_Alleven_from_range {

	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		int number, i, evenSum = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter Number limit : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
		}
		System.out.println("\n The Sum of Even Numbers 0 to  " + number + "  =  " + evenSum);
	}
}