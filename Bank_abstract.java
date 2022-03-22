
//abstraction 
abstract class Bank{
    abstract void rateofinterest();
    
} 

class SBI extends Bank{
    void rateofinterest()
    {
        System.out.println("SBI Bank rateofinterest is : 8%");
    } 
}
class Union extends Bank{
    void rateofinterest()
    {
        System.out.println("Union Bank rateofinterest is : 12%");
    } 
}
class Axis extends Bank{
    void rateofinterest()
    {
        System.out.println("Axis Bank rateofinterest is : 13%");
    } 
}
class Bank_abstract{
    public static void main(String[] args){
        Bank b=new SBI();
        b.rateofinterest();
        
        Bank u=new Union();
        u.rateofinterest();
        
        Bank a=new Axis();
        a.rateofinterest();
    }
}