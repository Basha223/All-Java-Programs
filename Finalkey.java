//1.final with variable=we can not change that value
class Student
{
final int rollno=123;
void display()
{
System.out.println("display");
}
}
class Toppers
{
void display()
{
System.out.println("Edit");
}
}
class Finalkey
{
public static void main(String args[])
{
Student s=new Student();
//s.rollno=345;
s.display();
System.out.println(s.rollno);
}
}
