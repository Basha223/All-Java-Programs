//create a static method to find the number amstrong number or not

class Armstrong1
{
    static void number(int number)
    {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        
    }
}

public class Armstrong_using_static {

    public static void main(String[] args) {

     Armstrong1.number(153);
    }
}