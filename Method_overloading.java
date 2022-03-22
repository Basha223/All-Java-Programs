//Method over loading
class Adder
{
static void Add(int a,int b)
{
System.out.println((a+b));
}
static void Add(int a,int b,int c)
{
System.out.println((a+b+c));
}
static void Add(double a,double b)
{
System.out.println((a+b));
}
static void Add(int a,double d)
{
System.out.println((a+d));
}
}

class Method_overloading
{
public static void main(String args[])
{
Adder.Add(2,4,5);
Adder.Add(23.5,12.6);
}
}