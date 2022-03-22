//creating class and Object
class Student
{

String name;
int rollno;
String section;
int marks;
String address;

void reading()
{
System.out.println(name+" Was reading At all time in the Class");
}
void writing()
{
System.out.println(name+" Writing The Notes only");
}

}
class Student_info
{
public static void main(String[] args)
{
Student std1=new Student();
std1.name="parthap";
std1.rollno=123;
std1.section="A";
std1.marks=85;
std1.address="vijayawada";

System.out.println("Student 1 information:");
System.out.println("Name:"+std1.name+"\n"+"Roll No:"+std1.rollno+"\n"+"Section:"+std1.section+"\n"+"Marks:"+std1.marks+"\n"+"Adress:"+std1.address);
std1.reading();
std1.writing();
System.out.println("\n");

Student std2=new Student();
std2.name="Basha";
std2.rollno=345;
std2.section="B";
std2.marks=90;
std2.address="Nellore";
System.out.println("Student 2 information:");
System.out.println("Name:"+std2.name+"\n"+"Roll No:"+std2.rollno+"\n"+"Section:"+std2.section+"\n"+"Marks:"+std2.marks+"\n"+"Adress:"+std2.address);
std2.reading();
std2.writing();


}
}