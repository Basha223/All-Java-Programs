/* 4. a java Program that demonstrating the garbage collection by calling System.gc().*/

public class Demonstarting 
{
    int rollno;
    public void finalize(){
        System.out.println("Garbage Collected");
    }

    public static void main(String[ ] args) 
    {
        Demonstarting obj=new Demonstarting();
        obj.rollno=1234;
        System.out.println(obj.rollno);
        Demonstarting obj1=new Demonstarting();
        obj1=obj;
        obj=null;
        System.gc();
        System.out.println(obj);

    }
}
