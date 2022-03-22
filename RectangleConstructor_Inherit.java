class Rectangle{
    double length;
    double bredth;
    Rectangle(double length,double bredth)
    {
        this.length=length;
        this.bredth=bredth;
    }
    void area()
    {
      double area;
      area=this.length*this.bredth;
      System.out.println("Area of Rectangle is :"+area);
    }
    void perimeter()
    {
        double perimeter;
        perimeter=2*(this.length+this.bredth);
        System.out.println("The Perimeter Is :"+perimeter);
    }
}
class Square extends Rectangle{
    double side;
    Square()
    {
        this.side=4;
        super(side,side);
    
    }
    void area()
    {
        
        double area;
        area=this.side*this.side;
        System.out.println("Area of Side Is :"+area);
       
    }
    void perimeter()
    {
        
        double perimeter;
        perimeter=4*this.side;
        System.out.println("Perimeter of Squre Is :"+perimeter);
       
    }
}
class RectangleConstructor_Inherit{
    public static void main(String args[]){
        Square s=new Square();
        s.area();
        s.perimeter();
    }
}