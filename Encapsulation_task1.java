/*Encapsulation task
create bean class Employee

declare private variables eid,ename,esalary

setters and getters

main class create 2 objects*/
import java.util.*;
class Employee{
    private String name;
    private int id;
    private String grade;
    private double salary;
    void setName(String name)
    {
        this.name=name;
    }
    void setId(int id)
    {
        this.id=id;
    }
    void setGrade(String grade)
    {
        this.grade=grade;
    }
    void setSalary(double salary)
    { 
        this.salary=salary;
    }
    String getName()
    {
        return this.name;
    }
    int getId()
    {
        return this.id;
    }
    String getGrade()
    {
        return this.grade;
    }
    double getSalary()
    {
        return this.salary;
    }
    
}
class Encapsulation_task1
{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        
        System.out.print("Enter Employee name:");
        String n=sc.nextLine();
        e.setName(n);
        
        
        System.out.print("Enter Employee ID:");
        int i=sc.nextInt();
        e.setId(i);
       
        
        System.out.print("Enter Employee Grade:");
        String g=sc.next();
        e.setGrade(g);
       
        
        System.out.print("Enter Employee Salary:");
        double s=sc.nextDouble();
        e.setSalary(s);
        
        System.out.print("------------"+"\n");
        System.out.print("Enter Employee 2 name:");
        String n1=sc1.nextLine();
        e.setName(n1);
        
        
        System.out.print("Enter Employee 2 ID:");
        int i1=sc1.nextInt();
        e.setId(i1);
       
        
        System.out.print("Enter Employee 2 Grade:");
        String g1=sc1.next();
        e.setGrade(g1);
       
        
        System.out.print("Enter Employee 2 Salary:");
        double s1=sc1.nextDouble();
        e.setSalary(s1);
        
        System.out.println("*****Employee 1 Details:*****");
        System.out.println(e.getName());
         System.out.println(e.getId());
          System.out.println(e.getId());
          System.out.println(e.getSalary());
          
          
          System.out.println("******Employee 2 Details:****");
        System.out.println(e.getName());
         System.out.println(e.getId());
          System.out.println(e.getId());
          System.out.println(e.getSalary());
        
        
        
    }
}
