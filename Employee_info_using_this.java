//this keyword example
import java.util.*;
class Employee
{
int empid;
String empname;
String empgrade;
int empsalary;
String empaddress;
//constructor overloading
Employee(int empid,String empname,String empgrade,int empsalary,String empaddress)
{
    this.empid=empid;
    this.empname=empname;
    this.empgrade=empgrade;
    this.empsalary=empsalary;
    this.empaddress=empaddress;
}

void display()
{
System.out.println(empid+"\n"+empname+"\n"+empgrade+"\n"+empsalary+"\n"+empaddress);
}
}
class Employee_info_using_this
{
public static void main(String[] args)
{
Employee emp1=new Employee(101,"Basha","alite",50000,"Nellore");
System.out.println("Student 1 information");
emp1.display();

Employee emp2=new Employee(102,"Prathap","mango",40000,"Vijayawada");
System.out.println("Student 2 information");
emp2.display();

Employee emp3=new Employee(103,"Khaja","plane",60000,"Nellore");
System.out.println("Student 3 information");
emp3.display();
}
}