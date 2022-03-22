//Write a JAVAprogram to print all alphabets from a to z. - using while loop

public class Print_atoz {

	public static void main(String[] args) {

		char character = 'A';

	
		System.out.print("Upper Case Alphabets Displayed \n");
		while (character <= 'Z') {
			System.out.print(character + " ");
			character++;
		}

		System.out.print("\n\n");

	
		character = 'a';
		System.out.print("Lower Case Alphabets Displayed \n");
		while (character <= 'z') {
			System.out.print(character + " ");
			character++;
		}
	}
}