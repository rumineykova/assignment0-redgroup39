
public class Conversion 
{
	 public static boolean validation(double x) //validation check
	    {
	        if (x < 0)
	        {
	            System.out.println("Invalid parameter");
	            return false;
	        } else {
	            return true;
	        }
	    }
	    
	    public static double gramsToPoundsAndOunces() 
	    {
	        System.out.println("Enter grams: ");
	        double grams = ScannerInput.inputDouble();

	        if (!validation(grams)) 
	        {
	            return -1;
	        } else {
	            double ounces = grams / 28.3495231;
	            int pounds = (int) ounces / 16;
	            float remainingOunces = (float) ounces % 16;

	            System.out.println(grams + " grams to Pounds and Ounces = " + pounds + "lb and " + remainingOunces + "oz");

	            return grams;
	        }
	    }
	    
	    public static double poundsAndOuncesToGrams()
	    {
	        System.out.print("Input Pounds= ");
	        double pounds = ScannerInput.inputDouble();

	        System.out.print("Input Ounces= ");
	        double ounces = ScannerInput.inputDouble();

	        if ((validation(pounds)) && ((validation(ounces)) && (ounces >= 16)))
	        {
	            return -1;
	        } else {
	            double grams = (pounds * 454);
	            grams += (ounces * 28.3495);
	            System.out.println(pounds + "lb, " + ounces + "oz = " + grams + " grams");

	        } return ounces;
	    }
	    
	    public static double cmToFeetAndInches()
	    {
	        System.out.println("Enter Centimeters: ");
	        double cm = ScannerInput.inputDouble();

	        if (!validation(cm))
	        {
	            return -1;
	        } else {
	            double inches = cm / 2.54;
	            int feet = (int) inches / 12;
	            float remainingInches = (float) inches % 12; //decreases decimal numbers by changing it to a float data type

	            System.out.println(cm + "cm to Feet and Inches = " + feet + "ft " + remainingInches + "in");

	            return cm;
	        }
	    }
	    
	    public static double feetAndInchesToCm()
	    {

	        System.out.print("Input Feet= ");
	        double feet = ScannerInput.inputDouble();

	        System.out.print("Input Inches= ");
	        double inches = ScannerInput.inputDouble();

	        if ((validation(feet)) && ((validation(inches)) && (inches >= 12)))
	        {
	            return -1;
	        } else {
	            double centimeters = (feet * 30.48);
	            centimeters += (inches * 2.54);
	            System.out.println(feet + "feet, " + inches + "inches = " + centimeters + " cm");

	        } return inches;
	    }
}
