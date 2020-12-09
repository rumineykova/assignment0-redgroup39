import java.util.Scanner;

public class Calculator {
	//1.  User sees: Please choose an option between 1 and 8
	//2.  User enters a number, for example 4
	//3.  User sees: The user chose  option 4
	// ....
	public static void main(String[] args) {
		System.out.println("Enter a task");
		Scanner scanner = new Scanner(System.in);		
		int subtask = scanner.nextInt(); 	
		System.out.println("The chosen subtask is " + subtask);
		
		switch (subtask) {
		case 1: 
			subtask1();break;
		case 2: 
			subtask2();
			System.out.print("The chosen subtask is " + subtask); 
			break;
		case 4:
			subtask4();
			break;
		case 6: 
			subtask6(); 
			break;
		default: System.out.print("Invalid Value");
		scanner.close();
		}
	}

	public static void subtask1() {
		System.out.print("Task 1 is about adition");
	}
	
	public static void subtask2() {
		System.out.print("Task 2 is about adition");
	}
	
	public static void subtask3() {
		System.out.print("Task 3 is about temperature");
	}
	
	 public static void subtask4() {

	        String input;
	        do {
	        	System.out.println();
	            System.out.println("Conversions: Input 'Weight', 'Length' Or to Exit: input 'Exit'"); //User Menu
	            input = ScannerInput.inputToLowerCase();

	             if (input.equals("weight")) // tests to see if the input is equal to weight
	                {
	                    System.out.println("Conversion type: input 'Imperial' Or 'Metric'");
	                    input = ScannerInput.inputToLowerCase(); // the following if statements check the user input
	                    if (input.equals("imperial")) {  
	                        Conversion.gramsToPoundsAndOunces();
	                    } else if (input.equals("metric")){
	                        Conversion.poundsAndOuncesToGrams();
	                    }
	                }
	             else if (input.equals("length")) // tests to see if the input is equal to length
	                {
	                    System.out.println("Conversion type: input 'Imperial' Or 'Metric'");
	                    input = ScannerInput.inputToLowerCase();

	                    if (input.equals("imperial")) {
	                        Conversion.cmToFeetAndInches();
	                    } else if (input.equals("metric"))
	                    {
	                        Conversion.feetAndInchesToCm();
	                    }
	                }
	             if (input.equals("exit")) {
//	                    main(); //go back to the main menu to select a different subtask
	                }

	        }while (!input.equals("exit"));

	        ScannerInput.closeScanner();
	    }
	
	public static void subtask5() {
		int decimal;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		decimal = in.nextInt();
		int input;
		int binary[] = new int[50];
		int index = 0;
		input = decimal;
		
		if(decimal < 0 )
		{
			System.out.println("Error: number not positive, try again");
		}
		else
		{
			if(decimal <= 1)
			{
				System.out.println("0 is the binary form for " + input);
			}
			else
			{
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
	 
	public static void subtask6() {
		System.out.println("Enter a binary number");
		Scanner scanner = new Scanner(System.in);
		int binary = scanner.nextInt();
		int result = Task6.getDecimal(binary);
		System.out.println("Decimal of " + binary + " is " + result);
		scanner.close();
	}

}
