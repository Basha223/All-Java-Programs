import java.util.Scanner;
class ATMOperations {
//declare wcount varaible
int wcount=1;
double bal=10000;
// create object for Scanner class
Scanner s=new Scanner(System.in);
// create method called deposit()
public void deposit() {
int amt=0;
System.out.println("Enter deposit amount");
amt=s.nextInt();
bal=bal+amt;
System.out.println("Available bal : "+bal);
}
// create method called withdraw()
public void withdraw() {
int amt=0;
System.out.println("Enter withdraw amount");
amt=s.nextInt();
bal=bal-amt;
wcount++;
System.out.println("Available bal : "+bal);
}
//create method called balenquiry()
public void balenquiry() {
System.out.println("Available bal : "+bal);
}
//create viewoptions() method
public void viewoptions() {
// display list of options such as 1. deposit 2. withdraw 3. balance enquiry 0. EXIT
System.out.println("\n1. Deposit");
System.out.println("2. withdraw");
System.out.println("3. balance enquiry");
System.out.println("0. Exit");
// accept option from user
System.out.println("Enter your option");
int option=s.nextInt();
switch(option){
case 1:{
// call deposit() method and viewoptions() method
deposit();
viewoptions();
break;
}
case 2:{
// check wcount<=3 or not, if condition is true call withdraw() and viewoptions()
if(wcount<=3){
withdraw();
viewoptions();
}
else{
// throw ArithmeticException
throw new ArithmeticException("Your Withdraw limit is over");
}
break;
}
case 3:{
// call balenquiry() and viewoptions() method
balenquiry();
viewoptions();
break;
}
case 0: {
System.out.println("Thank you visit again");
break;
}
default:{
System.out.println("Invalid option");
}
}
}
}
public class Atm_Thow_Exception1
{
public static void main(String args[]) {

 // create object for ATMOperations class
ATMOperations obj=new ATMOperations();
// calling viewoptions()
obj.viewoptions();
}
}