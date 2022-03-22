//Main Class outside of the Package
import Shape1.*;
class hello implements Circle1,Square1{
    public void draw()
    {
        System.out.println("Circle");
    }
    public void draw1(){
        System.out.println("Square");
    }
}
class Main1{
    public static void main(String[] args){
        /*Circle1 c=new Circle1();
        c.draw();*/
        hello c=new hello();
        c.draw();
        c.draw1();
        
    }
}
