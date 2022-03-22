//Student information and grades
import java.util.Scanner;
class Student{
    String sname;
    int srollno;
    String ssec;
    int internal_marks;
    int external_marks;
    int project_marks;
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        sname=sc.next();
        System.out.println("Enter Student Rollname:");
         srollno=sc.nextInt();
        System.out.println("Enter Student Section:");
         ssec=sc.next();
        System.out.println("Enter Student internal_marks:");
        internal_marks=sc.nextInt();
         System.out.println("Enter Student external_marks:");
        external_marks=sc.nextInt();
        System.out.println("Enter Student project_marks:");
        project_marks=sc.nextInt();
    }
        void display(){
            System.out.println(sname+"\n"+srollno+"\n"+ssec+"\n"+internal_marks+"\n"+external_marks+"\n"+project_marks);    
            }
    
    
    
     void grade(){
         
         float total_marks,parcentage;
         total_marks=(internal_marks+external_marks+project_marks);
         parcentage=(total_marks/300)*100;
         if(parcentage<90&&parcentage>=80)
         {
             System.out.println("Your Grade is:A");
         }
             
             else if(parcentage<80&&parcentage>=70)
             {
                 System.out.println("Your Grade is:B");
             }
                 
                 else if(parcentage<70&&parcentage<=60)
                 {
                     System.out.println("Your Grade is:C");
                 }
                     else{
                         System.out.println("Your Not graded or failed");
                         
                     }
             }
}    
     
class Student_marks_from_user{
    public static void main(String[] args){
        Student st1=new Student();
        st1.input();
        st1.display();
        System.out.println("Student  1 Information");
        st1.grade();
        
        System.out.println("\n--------------------------");
       
        Student st2=new Student();
        st2.input();
        st2.display();
         System.out.println("Student 2 Information");
        st2.grade();
        
        
    }
}
    