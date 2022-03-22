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
    
void  totalsalary(){
    
    float grosssalary,totalsalary,da,hra;
    
    /*Scanner emp=new Scanner(System.in);
System.out.println("Enter employee name");

    String  Ename=emp.nextString();
    System.out.println("Enter Employee Salary:");
       float salary=emp.nextFloat();
       */
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
class Salary_Info
{
    public static void main(String[] args){
        
        Employee emp1=new  Employee();
        
        emp1.Empid=101;
        emp1.Ename="Prathap";
        emp1.Edept="Administration";
        emp1.Esalary=12500;
        emp1.Eadress="vijayawada";
        System.out.println("Employee"+" "+emp1.Ename+"Information:");
        System.out.println("ID:"+emp1.Empid+"\n"+" Name:"+emp1.Ename+"\n"+"Department:"+emp1.Edept+"\n"+"Salary:"+emp1.Esalary+"\n"+"Adress:"+emp1.Eadress);
        emp1.totalsalary();
        

 Employee emp2=new  Employee();
        
        emp2.Empid=102;
        emp2.Ename="Basha";
        emp2.Edept="Manager";
        emp2.Esalary=60000;
        emp2.Eadress="Nellore";
        System.out.println("Employee"+" "+emp2.Ename+"Information:");
         System.out.println("ID:"+emp2.Empid+"\n"+"Name:"+emp2.Ename+"\n"+"Department:"+emp2.Edept+"\n"+"Salary:"+emp2.Esalary+"\n"+"Adress:"+emp2.Eadress);
    
        emp2.totalsalary();
        
    }
}

