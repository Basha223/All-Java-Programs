//create employee class store 5 object ArrayList_Store_Object_formuser
import java.util.*;
class Employee{
    String name;
    String grade;
    double salary;
    Employee(String n,String g,double r)
    {
        name=n;
        grade=g;
        salary=r;
    }
}
class ArrayList_Store_Object_formuser{
    public static void main(String[] args){
        ArrayList<Employee> emp=new ArrayList();
        Scanner sc=new Scanner(System.in);
        String name;
        String grade;
        double salary;
        for(int i=0;i<3;i++){
            System.out.println("Enter Name of the Employee:");
            name=sc.next();
            System.out.println("Enter Employee Grade :");
            grade=sc.next();
            System.out.println("Enter Employee Salary:");
            salary=sc.nextInt();
            emp.add(new Employee(name,grade,salary));
        }
        for(Employee e:emp){
            System.out.print("********************")
            System.out.println("Information of Employees");
            System.out.println(e.name+" "+e.grade+" "+e.salary);
        }
        }
    }
