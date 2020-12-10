import java.util.Scanner;
public class converter 
{

	public static void main(String[] args) 
	{
		int userChoice = optionSelection();
		ifSelection(userChoice);
	}
	
	public static int optionSelection() 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please select one of the options:");
		System.out.println("[1] Celsius to Fahrenheit\n[2] Fahrenheit to Celsius\n[3] Quit:");
		int choice = keyboard.nextInt();
		return choice;
	}
	
	public static void ifSelection(int userChoiceIn) 
	{
		if (userChoiceIn == 1) 
		{
			double userCelcius = userInputCel();
			celToFar(userCelcius);
		}
		
		else if(userChoiceIn == 2) 
		{
			double userFar = userInputFar();
			farToCel(userFar);
		}
		
		else 
		{
			userQuit();
		}
	}
	
	public static double userInputCel() 
	{
		double celcius;
		Scanner keyboard = new Scanner(System.in);
		do
		{
			System.out.print("Enter any temperature in celcius that is above absolute zero: ");
			celcius = keyboard.nextDouble();
		}while(celcius <= -273.15);
		return celcius;
	}
	
	public static double userInputFar() 
	{
		double fahrenheit;
		Scanner keyboard = new Scanner(System.in);
		do 
		{
			System.out.print("Enter any temperature in Fahrenheit that is above absolute zero: ");
			fahrenheit = keyboard.nextDouble();
			
		}while(fahrenheit <= -459.67);
		return fahrenheit;
	}
	
	public static void celToFar(double userCelciusIn) //don't forget to mention data type of the parameter you use 
	{
		double farFormula = ((9 * userCelciusIn) / 5) + 32;
		System.out.println("The temperatuer from Celsius to Fahrenheit is: " + farFormula);
	}
	
	public static void farToCel(double userFarIn) //don't forget to mention data type of the parameter you use 
	{
		double celFormula = (5 * (userFarIn - 32)) / 9;
		System.out.println("The temperatuer from Celsius to Fahrenheit is: " + celFormula);
	}
	
	public static void userQuit() 
	{
		System.exit(0);
	}
	
	
	

}