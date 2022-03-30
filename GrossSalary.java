/* 2. Write a program to accept basic salary from user and find gross salary. Gross_Salary = basic+DA+HRA.  
      DA is 82% on basic and HRA is 70% on basic.  Use setter and getter methods to set and get values. 
      After printing gross salary display user defined message once object got garbage collected.

      Sample Input:
      Enter Basic salary: 23000
      
      Expected Output:
      Your gross salary is: 57960
      Object is garbage collected
*/
import java.util.*;
public class GrossSalary 
{
    double basic;
    double da;
    double hra;
   void setBasic(double basic)
   {
       this.basic=basic;
   }
   void setDa(double da)
   {
       this.da=da;
   }
    void setHra(double hra)
   {
       this.hra=hra;
   }
   double getBasic()
   {
       return this.basic;
   }
   double getDa()
   {
       return this.da;
   }
   double gethra()
   {
       return this.hra;
   }
   public void finalize()
   {
       System.out.println("Object is garbage collected");
   }
    public static void main(String[ ] args) 
    {
        double Gross_Salary=0;
        GrossSalary obj=new GrossSalary();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic pay:");
        double b=sc.nextDouble();
        obj.setBasic(b);
        
        System.out.println("Enter DA Percentage:");
        double da1=sc.nextDouble();
        obj.setDa(da1);
        
        System.out.println("Enter HRA Percentage:");
        double hra1=sc.nextDouble();
        obj.setHra(hra1);
        
        da1=(da1*b)/100;
        hra1=(hra1*b)/100;
        Gross_Salary=b+da1+hra1;
        System.out.println("Gross Salary is:"+Gross_Salary);
        obj=null;
        System.gc();

    }
}


//Another way 
/*
import java.util.*;
public class GrossSalary 
{
Scanner sc = new Scanner(System.in);
/* Override finalize() method to print user defined message,

throw Throwable class from method signature.*/

/*@Override

protected void finalize() throws Throwable {

System.out.println("\nObject got garbage collected.");

}

double basic_Salary;

double DA;

double HRA;

double Gross_Salary;
public void setDetails()

{

System.out.print("Enter Basic Salary : ");

this.basic_Salary = sc.nextDouble();
this.DA = 0.82*basic_Salary;
this.HRA = 0.7*basic_Salary;
this.Gross_Salary = basic_Salary + DA + HRA ;

}
public void getDetails()

{
System.out.println("Your gross salary is : "+ (int)Gross_Salary);
}
public static void main(String[ ] args) {
GrossSalary obj = new GrossSalary();

obj.setDetails();
obj.getDetails();
obj = null;

// call gc() method.

System.gc();
}

}
*/