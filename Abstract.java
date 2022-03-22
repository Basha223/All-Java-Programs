abstract class Shape{
abstract void draw();
}
class Circle extends Shape{
void draw()
{
System.out.println("circle");
}
}
class Square extends Shape
{
void draw()
{
System.out.println("Square");
}
}
class Rectangle extends Shape{
void draw()
{
System.out.println("Rectangle");
}
}
class Abstract
{
public static void main(String args[])
{
Shape s=new Circle();
s.draw();
}
}