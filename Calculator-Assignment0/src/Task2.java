import java.util.Scanner;
public class Task2 {
	public static double powerfunction(int pow, double base) {
		double result;
		result = base;
		if (pow > 1) {
			int i = 1;
			do{
			result *= base;
			i++;
			} while (i< pow);
			return result;
		}
		if (pow < 0) {
				int pow2 = pow*-1;
				for(int i=0;i<=(pow2);++i);{
					result *= base;
			} return 1/result;
		}
		if (pow == 1) {return base;}
	    return 1;
	}

	public static int modulo(int divider,int divident){
		int modu = divident - (divider * (divident / divider));
		if (divider > divident){System.out.println("Error! Divider is bigger than Divident. Please try again."); MainMenu();}
		return modu;
		
	}

	public static double squareroot(double base){
		double half = base / 2;
		double temp = 0;
		do{
			temp = half;
			half = (base / temp + temp) / 2;
		} while (half != temp);
		return temp;
	}
	
	public static double cuberoot(double base){
	 double half;
		if (base >= 200000){
		half = base / 10000;
		}else{
		half = base / 10;
		}
		double[] index = new double[11];
		index[0] = half;
		for(int i = 0; i <= 9; i++){
			index[(i+1)] = index[i] * ((index[i] * index[i] * index[i]) + 2 * base) / (2 * (index[i] * index[i] * index[i]) + base);
		}
		return index[10];
	}

	public static void MainMenu(){
	 System.out.println("1. Power, 2. Mod, 3. Root");
	 Scanner scanner = new Scanner(System.in);
	 int options = scanner.nextInt();
	 if (options == 1) {
	 System.out.println("Power Function");
	 System.out.print("Enter a base: ");
		double baseval = scanner.nextDouble();
		System.out.print("Enter a power: ");
		int pow = scanner.nextInt();
		double powfunc = powerfunction(pow,baseval);
		System.out.println(baseval + " to the power of " + pow + " equals " + powfunc);
		Repeater();}
		  else if (options == 2){
			System.out.println("Mod Function");
			System.out.print("Enter divider value: ");
			int divider = scanner.nextInt();
			System.out.print("Enter divident value: ");
			int divident = scanner.nextInt();
			int modulus = modulo(divider,divident);
			System.out.println("Modulus of " + divident + " and " + divider + " is equal to " + modulus);
			Repeater();}
		 else if (options == 3){
		 System.out.println("Root Function");
		 System.out.print("Enter a base value: ");
		 double base = scanner.nextDouble();
		 System.out.println("Type 1 for Square root, 2 for Cube root:");
		 int choice = scanner.nextInt();
		 if (choice == 1){
			System.out.print("Square root of " + base + " is " + squareroot(base));
		 } else if (choice == 2){
			System.out.print("Cube root of " + base + " is " + cuberoot(base));
		 } else{ throw new Error("Invalid value. Program exited.");}
		 Repeater();}
		else { System.out.println("Invalid value.");
		 Repeater();}
		}
	public static void Repeater(){
	System.out.println("Type in 1 for Task 2 Menu. 2 to go back to Main Menu. Press enter to confirm.");
	Scanner scanner = new Scanner(System.in);
	int result = scanner.nextInt();
	if (result == 1){
		MainMenu();;}
		else if (result == 2){
		Calculator.mainMenu();}
		else{ throw new Error("Invalid value. Program exited.");}
   }
}
	
	
		