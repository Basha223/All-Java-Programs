//interface 
interface Animal{
    void rest();
}
class dog implements Animal{
    public void rest(){
        System.out.println("Dog is eating food");
    }
}
class cat implements Animal{
   public void rest(){
        System.out.println("Cat is drinking Milk");
    }
}

class Animal_interface{
    public static void main(String[] args){
       Animal a=new dog();
       a.rest();
       
       Animal b=new cat();
       b.rest();
    }
}