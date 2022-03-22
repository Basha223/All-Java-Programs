//Example for NullpointerExceptionHandling
class NullpointerExceptionHandling{
    public static void main(String[] args){
        try{
            String s=null;
        System.out.print(s.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        
    }
    String s="basha";
        System.out.print("length of string is:"+s.length());
}
}