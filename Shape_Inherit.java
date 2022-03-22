class Shape{
    void method()
    {
        System.out.println("This Is Shape Method ");
    }
}
class Rectangle extends Shape{
    void method1()
    {
        System.out.println("This Is Rectangular Shape "); 
    }
}
class Circle extends Shape{
    void method2()
    {
         System.out.println("This Is Circular Shape ");
    }
}
class Square extends Rectangle{
    void method3()
    {
         System.out.println("Square is a Rectangle ");
    }
}
class Shape_Inherit{
    public static void main(String args[]){
        Square sq=new Square();
        sq.method();
        sq.method1();
        sq.method3();
    }
}