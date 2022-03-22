//Java program to print a multiplication table for any number
import java.util.Scanner;

public class Multiplication_table {
    
   public static void main(String args[]) {
       
      System.out.println("Enter Whcih table You want to: ");
      
      Scanner sc = new Scanner(System.in);
      
      int num = sc.nextInt();
      
      for(int i=1; i<= 10; i++) {
          
         System.out.println(""+num+" X "+i+" = "+(num*i));
      }
   }
}