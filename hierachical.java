//emp salary using hierachical inheritance
class Employee
{
int empid;
String name;
int salary;
String DOB;
double HRA()
{
double hra=(salary*20)/100;
return hra;
}
}
class Manager extends Employee
{
double DA()
{
double da=(salary*10)/100;
return da;
}
}

class clerk extends Employee
{
double PF()
{
double pf=(salary*2)/100;
return pf;
}
}

class hierachical
{
public static void main(String args[])
{
clerk c=new clerk();
c.salary=2000;
double pf=c.PF();
double totalsalary=pf+c.salary;
System.out.println(totalsalary);
}
}