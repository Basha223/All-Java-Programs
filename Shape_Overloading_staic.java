//method overloading using static
class Shape{
    static void Draw(int l,int b)
    {
        System.out.println("The Area Of Rectangle Is :"+(l*b));
    }
      static void Draw(int s)
    {
        System.out.println("The Area Of Square Is :"+(4*s));
    }
      static void Draw(int s1,int s2,int s3)
    {
        System.out.println("The Area Of Traingle Is :"+(s2*s3)/2);
    }
}
class Shape_Overloading_staic
{
    public static void main(String args[])
    {
        Shape.Draw(5,5);
        Shape.Draw(10);
        Shape.Draw(5,5,5);
    }
}