//7. Write a JAVAprogram to check whether a character is alphabet or not.
import java.util.Scanner;
public class Check_Alphabet_not {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Character:");
        
        char c =sc.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}