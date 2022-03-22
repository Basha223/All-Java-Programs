//Write a JAVAprogram to check whether a number is Prime number or not.
import java.util.Scanner;

public class Check_prime
{
   public static void main(String[] args)
   {
      int num,count=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}