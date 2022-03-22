// Example for NumberFormatExceptionHandling
class NumberFormatExceptionHandling{
    public static void main(String[] args){
        String s="basha";
        try{
            
            System.out.println(Integer.parseInt(s));
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.print("Given String is:"+s);
        
    }
}