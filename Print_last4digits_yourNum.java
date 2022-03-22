//print last 4 digits of your mobile number
import java.util.Scanner;
public class Print_last4digits_yourNum{ 
    public static void main(String args[]){ 
         
        String mobileNum; 
//Use the scanner class to provide mobileNum at execution time 
  
Scanner scanner = new Scanner(System.in); 
System.out.println("Enter phone number (10 digits)"); 
mobileNum = scanner.nextLine(); 
int newnumber=mobileNum.length(); 
//Verify if the mobile number is equal to 10 digits or not 
if (newnumber == 10){ 
  
  System.out.println("number is valid"); 
//If the mobile number is equal to 10 digits then extract the last 4 digits else print error message 
//Print the result 
//System.out.println("Mobile number ends with ******"+variablename); 
  System.out.println("Mobile number ends with ******"+mobileNum.substring(6,10)); 
} 
  
else 
{ System.out.println("number is not valid\n error"); 
} 
  
} 
}