/*program to perform ATM operations such as deposit, withdraw
 and balance enquiry. Display list of options for user selection.
 Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.*/
  
import java.util.Scanner;  
public class Atm_thorw_Exception 
{  
    public static void main(String args[] )  
    { 
        int balance = 100000, withdraw, deposit,count=0;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("SBI ATM Transaction List");  
            System.out.println("Choose 1 for Withdraw Money");  
            System.out.println("Choose 2 for Deposit Money ");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.print("Choose the operation you want to perform:");  
              
            // choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1: 
                    if(count>3)
                System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();  
                    if(balance >= withdraw)  
                    {
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money"); 
                        count++;
                        System.out.println("limit is:"+count);
                        }
                    else
                    {  
                        System.out.println("Insufficient Balance");  
                        } 
                        System.out.println("");  
                        break;  
                }
                catch(Exception e){
                                    System.out.println(e);
                                }
                    
                case 2:  
                    System.out.print("Enter money to be deposited:");  deposit = sc.nextInt();  
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully depsited");  
                    System.out.println("");  
                    break;  
   
                case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance :"+balance);  
        System.out.println("");  
        break;  
            }  
        }  
    }  
}  
