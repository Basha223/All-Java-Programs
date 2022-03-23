//Example on throws keyword
import java.io.*;
class Throws_keyword
{
    static void Validate() throws IOException
    {
        System.out.println("validating");
    }

    public static void main(String[] args){
        try{
        Validate();}
        catch(Exception e){
            System.out.println(e);
        }
    }
}
