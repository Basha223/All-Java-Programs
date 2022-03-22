//interface
interface Bank{
    void rateofinterest();
}
class SBI implements Bank{
    public void rateofinterest(){
        System.out.println("SBI Bank rateofinterest is :12%");
    }
}
class Union implements Bank{
   public void rateofinterest(){
        System.out.println("SBI Bank rateofinterest is :15%");
    }
}
class Axis implements Bank{
    public void rateofinterest(){
        System.out.println("SBI Bank rateofinterest is :11%");
    }
}
class Bank_interface{
    public static void main(String[] args){
        Bank b=new SBI();
        b.rateofinterest();
        
        Bank u=new Union();
        u.rateofinterest();
        
        Bank a=new Axis();
        a.rateofinterest();
        
    }
}