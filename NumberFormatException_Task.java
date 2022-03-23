/*Write a program to accept firstName, lastName and mobileNumber in stringformat.
Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber.
Handle NumberFormatException while converting mobileNumber to long.*/
import java.util.*;
class NumberFormatException_Task{
public static void main(String[] args){
    int digit, sum = 0;  
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first Name:");
    String fname=sc.next();
    System.out.print("Enter last Name:");
    String lname=sc.next();
    
    System.out.print("Enter Mobile Number:");
    String mobilenum=sc.next();
    try{
    long num=Long.parseLong(lname);
}
catch(Exception e){
    System.out.println(e);
}
    
    System.out.println("--------------------------");
    System.out.println("length of firstNameis:"+fname.length());
    System.out.println("length of lastNameis:"+lname.length());
    System.out.println("Mobile number is:"+mobilenum);
     //System.out.println("length of mobile number:"+num.length());
    /*while(num>0)
    {
        digit = num%10;  
        sum = sum + digit;  
        num = num/10;  
        
    }  
    System.out.println("Sum of Digits: "+sum);*/  
    
}
}