//Example for  create 5 objects from Arraylist
import java.util.*;
class Student{
    int rollno;
    String name;
    String sec;
    Student(int r,String n,String s){
        rollno=r;
        name=n;
        sec=s;
    }
}
class Arraylist_Strore_Objects
{
    public static void main(String[] args){
        ArrayList<Student> stu=new ArrayList();
        stu.add(new Student(1,"Basha","A"));
        stu.add(new Student(2,"Prathap","B"));
        stu.add(new Student(3,"Haseena","C"));
        for(Student s:stu){
            System.out.println(s.rollno+" "+s.name+" "+s.sec);
        }
    }
}
