//Write a JAVAprogram to count total number of negative elements in an array.
import java.util.Scanner;
public class Count_neg_pos_elements{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i;
		int positiveCount = 0, negativeCount = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] >= 0)
			{
				positiveCount++;
			}
			else
			{
				negativeCount++;
			}
		}		
		System.out.println("\n Total Number of Positive Numbers in this Array = " + positiveCount);
		System.out.println("\n Total Number of Negative Numbers in this Array = " + negativeCount);
	}
}
