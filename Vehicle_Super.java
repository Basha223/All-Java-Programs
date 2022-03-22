class Vehicle{
    String color;
    String brand;
    int wheels=4;
}
class Auto extends Vehicle{
    int wheels=3;
    
    void display()
    {
        System.out.println("wheels are :"+super.wheels);
    }
    void running()
    {
        System.out.println("Auto Is Running Fast !..");
    }
}
class Vehicle_Super{
    public static void main(String args[]){
    Auto a=new Auto();
    a.color="red";
    a.brand="BMW";
   // a.wheels=3;
    System.out.println("Wheels are :"+a.wheels);
    System.out.println("Colour is :"+a.color);
    a.display();
    a.running();
    }
}