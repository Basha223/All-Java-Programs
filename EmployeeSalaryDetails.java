/* 3. Write a program to accept employee salary and 3 shopping bills, find how much % of amount 
      employee is spending on shopping on his/her salary. After printing % details, create another 
      reference variable for Employee object and clone employee object. Use setter and getter methods to set and get values. 
      Display user defined message once employee object got garbage collected.

      Sample Input: 
      Enter your salary: 10000
      Enter shopping bill1: 2000 
      Enter shopping bill2: 1400
      Enter shopping bill3: 500

      Expected Output:
      39 % of amount you are spending on shopping in your salary.
      Object got garbage collected.
*/
import java.util.*;
public class EmployeeSalaryDetails
{
/* Override finalize() method to print user defined message,

throw Throwable class from method signature.*/
@Override
protected void finalize() throws Throwable 
{
System.out.println("\nObject got garbage collected.");
}
Scanner sc = new Scanner(System.in);
double salary;
double bill1;
double bill2;
double bill3;
public void setDetails()
{
System.out.print("Enter your salary : ");
this.salary = sc.nextDouble();
System.out.print("Enter shopping bill1 : ");
this.bill1 = sc.nextDouble();
System.out.print("Enter shopping bill2 : ");
this.bill2 = sc.nextDouble();
System.out.print("Enter shopping bill3 : ");
this.bill3 = sc.nextDouble();
}
public void getDetails()
{
double percentage = ((bill1+bill2+bill3)/salary)*100;
System.out.println(percentage + " % of amount you are spending on shopping in your salary.");
}
public static void main(String[ ] args) {
EmployeeSalaryDetails emp = new EmployeeSalaryDetails();
emp.setDetails();
emp.getDetails();
emp = null;
// call gc() method.
System.gc();
}
}