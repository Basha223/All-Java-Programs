import java.util.*;

/* bank class
name
acctype
acno;
getdata()--read the data
display()-display information

current account --bank

int balance;
deposit1(){

read the balance
int deposit=read

balance=balance+deposit;
}
withdraw()
{
10000
int withdraw_amount--read

if(withdrawamount>balance)
{
we can draw

}
else
{
balance=balance-withdraw;
System.out.println("remaining balanace amount"+balance);
}
}

main

current account

getdata()
display()
deposit()
withdraw() */

class Bank{
    String name;
    String acctype;
    int acno;
    
     Scanner sc=new Scanner(System.in);
    void getdata()
    {
       
        System.out.println("Enter the Name :");
        name=sc.next();
        System.out.println("Enter the Account type ");
        acctype=sc.next();
        System.out.println("Enter the Account No ");
        acno=sc.nextInt();
    }
    void display()
    {
        System.out.println("Name :"+name+"\nAccont Type :"+acctype+"\nAccont no :"+acno);
    }
}
class CurrentAccount extends Bank{
    double balance;
    void deposit1()
    {
        double deposit;
        System.out.println("Enter The Balance ");
        balance=sc.nextDouble();
        System.out.println("enter The Deposit amt");
        deposit=sc.nextDouble();
        balance=balance+deposit;
    }
    void withdraw()
    {
        double withdraw_amount;
        System.out.println("enter The Withdraw amt");
       withdraw_amount=sc.nextDouble();
        if(withdraw_amount>balance)
        {
            System.out.println("Insufficient Balance !..");
        }
        else 
        {
            balance=balance-withdraw_amount;
            System.out.println("Remaining amount is :"+balance);
        }
        
    }
    
}
class Bank_Inhertance{
    public static void main(String args[])
{
    CurrentAccount ca=new CurrentAccount();
    ca.getdata();
    ca.display();
    ca.deposit1();
    ca.withdraw();
}
}