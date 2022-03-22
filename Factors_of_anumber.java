//Write a JAVAprogram to find all factors of a number
public class Factors_of_anumber{
  public static void main(String[] args) {
    int number = 50;

    System.out.print("Factors of " + number + " are: ");

    
    for (int i = 1; i <= number; ++i) {

      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}