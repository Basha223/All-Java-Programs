//Student information and grades
class Student{
    String sname;
    int srollno;
    String ssec;
    int internal_marks;
    int external_marks;
    int project_marks;
    
    
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
     
class Student_marks{
    public static void main(String[] args){
        Student st1=new Student();
        System.out.println("Student  1 Information");
        
         System.out.println(st1.sname="Basha");
         
        System.out.println(st1.srollno=101);
        System.out.println(st1.ssec="A");
        System.out.println(st1.internal_marks=88);
        System.out.println(st1.external_marks=86);
        System.out.println(st1.project_marks=95);
        st1.grade();
        
        System.out.println("\n--------------------------");
       
        Student st2=new Student();
         System.out.println("Student 2 Information");
        System.out.println(st2.sname="Basha");
        
        System.out.println(st2.srollno=102);
        System.out.println(st2.ssec="A");
        System.out.println(st2.internal_marks=87);
        System.out.println(st2.external_marks=53);
        System.out.println(st2.project_marks=86);
        st2.grade();
        
    }
}
    