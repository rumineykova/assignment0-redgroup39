public class ScannerInput 
{
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static String inputToLowerCase()
    {
        String input = scanner.nextLine();
        input = input.toLowerCase(); // will accept both lower case and higher case inputs of W/L
        return input;
    }

    public static double inputDouble()
    {
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }

    public static void closeScanner()
    {
        scanner.close();
    }
}
