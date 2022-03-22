class Vehicle{
    String color;
    String brand;
    int wheels=4;
}
class Auto extends Vehicle{
    int wheels=3;
    
    void display()
    {
         
        System.out.println("Auto has 3 Wheels ");
    
    }
    void running()
    {
        System.out.println("Auto Is Running Fast !..");
    }
}
class Bike extends Auto{
    int wheels=2;
    void display()
    {
       System.out.println("Bike has 2 Wheels"); 
       super.display();
    }
    void running()
    {
       System.out.println("Bike is Running Fast..!");
       super.running();
    }
}
class Vehicle_SuperMethod{
    public static void main(String args[]){
    Bike b=new Bike();
    b.color="red";
    b.brand="BMW";
    b.wheels=4;
    System.out.println("Brand Is :"+b.brand);
    System.out.println("Vehicle Wheels are :"+b.wheels);
    System.out.println("Colour is :"+b.color);
    b.display();
    b.running();
    }
}