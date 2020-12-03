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
		default: System.out.print("something else");
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

}
