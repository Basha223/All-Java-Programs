//6. Write a JAVAprogram to check whether a year is leap year or not.
import java.util.Scanner;
public class Check_leapyear {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A year:");
        
        int year =sc.nextInt();
       
         
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
    }
}