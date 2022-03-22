//method overloading
class Sum{
     void Add(int a,int b)
    {
        System.out.println("The Sum of two numbers Is :"+(a+b));
    }
       void Add(int a,int b,int c)
    {
        System.out.println("The Sum of three numbers Is :"+(a+b+c));
    }
       void Add(double x,double y,int z)
    {
        System.out.println("The Sum  Of Three numbers Is :"+(x+y+z));
    }
}
class Sum_Overloading
{
    public static void main(String args[])
    {
        Sum s=new Sum();
        s.Add(5,5);
        s.Add(10,20,30);
        s.Add(25.4,20.5,5);
    }
}