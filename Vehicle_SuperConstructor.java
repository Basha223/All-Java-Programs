class Vehicle{
    String color;
    String brand;
    int wheels=4;
    Vehicle()
    {
      System.out.println(" Vehicle is Stopped"); 
    }
    
}
class Auto extends Vehicle{
    int wheels;
    
     Auto()
    {
      super();     
    System.out.println("Auto Is Moving ");
    }
  
}

class Vehicle_SuperConstructor{
    public static void main(String args[]){
    Auto a=new Auto();
    }
}