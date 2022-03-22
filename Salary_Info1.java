/*create a class Employee
eid,ename,edept,esalary.eaddress

totalsalary()

grosssalary=salary+HRA+DA

based on

if salary>10000 TO 20000
HRA is 20% da 45

grosssalary=salary+HRA+DA


if salary 20000 TO 40000
HRA is 25% da 20%

grosssalary=salary+HRA+DA

ELSE
HRA is 30% da 30%

Create the main class

2 objects employee
employee informaion
totalsalary*/
import java.util.Scanner;
class Employee
{
    int Empid;
    String Ename;
    String Edept;
    long Esalary;
    String Eadress;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        Empid=sc.nextInt();
        System.out.println("Enter employee Name:");
        Ename=sc.next();
        System.out.println("Enter Employee Department:");
        Edept=sc.next();
        System.out.println("Enter Employee Salary:");
        Esalary=sc.nextLong();
         System.out.println("Enter employee Adress:");
        Eadress=sc.next();
    }
    void display(){
        System.out.println(Empid+"\n"+Ename+"\n"+Edept+"\n"+Esalary+"\n"+Eadress);
        
    }
    
void  totalsalary(){
    
    float grosssalary,totalsalary,da,hra;
    
    
       if(Esalary>10000&&Esalary<=20000)
       {
           hra=(Esalary*25)/100;
           da=(Esalary*45)/100;
           grosssalary=hra+da;
           totalsalary=Esalary+grosssalary;
           System.out.println("The Gross salary of the employee is:" +grosssalary);
           System.out.println("The Total salary of the employee is:" +totalsalary);
       }
     else if(Esalary>20000&&Esalary<=40000){
         
            hra=(Esalary*25)/100;
           da=(Esalary*20)/100;
           grosssalary=hra+da;
           totalsalary=Esalary+grosssalary;
           System.out.println("The Gross salary of the employee is:" +grosssalary);
           System.out.println("The Total salary of the employee is:" +totalsalary);
           
       }
       else{
           hra=(Esalary*30)/100;
           da=(Esalary*30)/100;
           grosssalary=hra+da;
           totalsalary=Esalary+grosssalary;
           System.out.println("The Gross salary of the employee is:" +grosssalary);
           System.out.println("The Total salary of the employee is:" +totalsalary);
       }
       
}
}
class Salary_Info1
{
    public static void main(String[] args){
        
        Employee emp1=new  Employee();
        emp1.input();
        emp1.display();
        System.out.println("Employee I Information:");
       emp1.totalsalary();
        

        Employee emp2=new  Employee();
        emp2.input();
        emp2.display();
        System.out.println("Employee  II Information:");
         
        emp2.totalsalary();
        
    }
}

