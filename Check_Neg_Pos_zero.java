//3. Write a JAVAprogram to check whether a number is negative, positive or zero.

public class Check_Neg_Pos_zero
{  
public static void main(String[] args)   
{  
 
int num=912;  
//checks the number is greater than 0 or not  
if(num>0)  
{  
System.out.println("The number is positive.");  
}  
//checks the number is less than 0 or not  
else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
//executes when the above two conditions return false  
else  
{  
System.out.println("The number is zero.");  
}  
}  
}