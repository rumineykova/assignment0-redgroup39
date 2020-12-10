import java.util.Scanner;

public class Task5 {
	public static void decimalToBinary() {
		int decimal;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		decimal = in.nextInt();
		int input;
		int binary[] = new int[50];
		int index = 0;
		input = decimal;
		if(decimal < 0 ) { 
			System.out.println("Error: number not positive, try again");
		}
		else if(decimal <= 1)	{
			System.out.println("0 is the binary form for " + input);
		}
		else {
			while(decimal > 0)
			{
				binary[index] = decimal%2;
				decimal = decimal/2;
				index++;
			}
			for(int i = index - 1; i>=0;i--)
				System.out.print(binary[i]);
			System.out.print(" is the binary form for " + input);
		}
	}
}
