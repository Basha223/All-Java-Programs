//Dog information
class Dog
{
    String name;
    String color;
    String bread;
    String eyecolor;
    void bark(){
        System.out.println("Dog is barking");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Dog_Info{
    public static void main(String[] args){
        Dog dg1=new Dog();
        dg1.name="Tommy";
        dg1.color="Black";
        dg1.bread="Rot Wieler";
        dg1.eyecolor="Brown";
        System.out.println("Dog I Information:");
        System.out.println(dg1.name+"\n"+dg1.color+"\n"+dg1.bread+"\n"+dg1.eyecolor);
        dg1.bark();
        
       System.out.println("\n---------------------");
         Dog dg2=new Dog();
         dg2.name="Zimmy";
        dg2.color="Brown";
        dg2.bread="German Shaferd";
        dg2.eyecolor="Blue";
        System.out.println("Dog I Information:");
        System.out.println(dg2.name+"\n"+dg2.color+"\n"+dg2.bread+"\n"+dg2.eyecolor);
        dg2.eat();
        
    }
}
