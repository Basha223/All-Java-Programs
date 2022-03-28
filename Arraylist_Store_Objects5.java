//Example for create Student class store 5 objects in arraylist
import java.util.*;
class Student
{
int rollno;
String name;
String sec;
Student (int r,String n,String s)
{
rollno=r;
name=n;
sec=s;
}
}
class Arraylist_Store_Objects5
{
public static void main(String args[])
{
ArrayList<Student> stu=new ArrayList();
Scanner sc=new Scanner(System.in);
int rollno;
String name;
String sec;
for( int i=0;i<2;i++)
{
System.out.print:("Enter rollno");
rollno=sc.nextInt();
System.out.print:("enter name");
name=sc.next();
System.out.print:("enter section");
sec=sc.next();
stu.add(new Student(rollno,name,sec));
}
for(Student st:stu)
{
System.out.println(st.name+" "+st.sec+" "+st.rollno);
}
}
}