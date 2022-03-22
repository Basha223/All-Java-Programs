//Write a JAVAprogram to print all ASCII character with their values.
import java.util.Scanner;  
public class Ascii_value 
{  
public static void main(String args[])  
{  
System.out.print("Enter a character: ");  
Scanner sc = new Scanner(System.in);  
char chr = sc.next().charAt(0);  
int asciiValue = chr;  
System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  
}  
}  