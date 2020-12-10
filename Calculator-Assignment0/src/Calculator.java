import java.util.Scanner;

public class Calculator {
	//1.  User sees: Please choose an option between 1 and 8
	//2.  User enters a number, for example 4
	//3.  User sees: The user chose  option 4
	// ....
	public static void main(String[] args) 
	{
		mainMenu();
	}
	
	public static void mainMenu()
	{
		System.out.println("Enter a task between 2 - 6 Or to Exit enter 7");
		Scanner scanner = new Scanner(System.in);		
		int subtask = scanner.nextInt(); 	
	
		try {
		switch (subtask) 
		{

		case 2: 
			subtask2();
			break;
		case 3: 
			subtask3();
			break;
		case 4:
			subtask4();
			break;
		case 5:
			subtask5();
			break;
		case 6: 
			subtask6(); 
			break;
		case 7:
			System.out.println("Exiting Calculator...");
			break;
		default: 
			System.out.println("Invalid Value");
			mainMenu();
		scanner.close();
		}
		} catch (Exception e) {
			System.out.println("Ooops. Try again. ");
			mainMenu(); 
		} 
	}
	
	public static void subtask2() {
		System.out.println("Task 2 is about power, modulus and root.");
		Task2.MainMenu();
	}
	
	public static void subtask3() {
		converter.start();
		mainMenu();
	}
	
	
	 public static void subtask4() {

	        String input;
	        do {
	        	System.out.println();
	            System.out.println("Conversions: Input 'Weight', 'Length' Or to Exit to Menu: input 'Exit'"); //User Menu
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
	                    mainMenu(); //go back to the main menu to select a different subtask
	                }

	        }while (!input.equals("exit"));

	        ScannerInput.closeScanner();
	    }
	
	public static void subtask5() {
		Task5.decimalToBinary();
		mainMenu();
	}
	 
	public static void subtask6() throws Exception {
		System.out.println("Enter a binary number");
		Scanner scanner = new Scanner(System.in);
		int binary = scanner.nextInt();
		int result = Task6.getDecimal(binary);
		System.out.println("Decimal of " + binary + " is " + result);	
		System.out.println();
		
		mainMenu();
		// Rumy: Will this ever be executed?
		// When is scanner.close() needed
	
	}
}
