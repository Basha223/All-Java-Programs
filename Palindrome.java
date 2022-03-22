//Palindrome
public class Palindrome
{  
public static void main(String[] args)   
{  
int number = 1234, reverse = 0;  
int temp=number;
while(number != 0)   
{  
int remainder = number % 10; //
reverse = reverse * 10 + remainder;  
number = number/10;  
} 
if(temp==number)
{
    System.out.println("Palindrome");
}
    else{
        System.out.println("Not a palindrome");
    }
System.out.println("The reverse of the given number is: " + reverse);  
}  
}