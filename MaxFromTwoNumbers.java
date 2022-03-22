
//1. Write a JAVAprogram to find maximum between two numbers.

import java.util.Scanner;

public class MaxFromTwoNumbers
{
   public static void main(String[] args)
   {
      int numberOne, numberTwo, largest;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      numberOne = scan.nextInt();
      System.out.print("Enter the Second Number: ");
      numberTwo = scan.nextInt();
      
      if(numberOne>numberTwo)
         largest = numberOne;
      else
         largest = numberTwo;
      
      System.out.println("\nLargest = " +largest);
   }
}