//multiple inheritance solved using interfaces 
interface Bank
{
    void RateOfInterest();
}
interface Shape
{
    void draw();
}
class circle implements Bank,Shape
{
    public void RateOfInterest()
    {
        System.out.println("Rate Of Interest is : 8");
    }
    public void draw()
    {
        System.out.println("circle");
    }
}
class Multiple_inheritance_interface
{
    public static void main(String args[])
    {
        circle c=new circle();
        c.RateOfInterest();
        c.draw();
    /* Interface_Bank1 c=new Interface_Bank1();   
     c.RateOfInterest();*/
    }
}
