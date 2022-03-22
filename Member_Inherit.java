import java.util.*;
class Member
{
    String name;
    int age;
    long phno;
    String address;
    double salary;
    Scanner sc=new Scanner(System.in);
    void PrintSalary()
    {
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Age");
        age=sc.nextInt();
        System.out.println("Enter Phone no");
        phno=sc.nextLong();
        System.out.println("Enter Address");
        address=sc.next();
        System.out.println("Enter Salary");
        salary=sc.nextDouble();
    }
}
class Employee extends Member
{
    String specialization;
   
}
class Manager extends Member
{
    String department;
    
}

class Member_Inherit
{
    public static void main(String args[])
    {
        Employee emp=new Employee();
        emp.PrintSalary();
        emp.specialization="Mechanical";
        System.out.println("Specialization :"+emp.specialization);
        
        Manager mg=new Manager();
        mg.PrintSalary();
        mg.department="Resource";
      //  System.out.println("Specialization :"+mg.specialization);
        System.out.println("Departement :"+mg.department);
    }
}