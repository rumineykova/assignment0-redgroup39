public class Task6 {
public static int getDecimal(int binary) throws Exception{  
    int decimal = 0;  
    int count = 0;
    int lastDigit = 0; 

    while(binary != 0)
    {
    	if ((lastDigit > 1) || (lastDigit < 0))
    	{
    		System.out.println("Enter a valid Input");
    		throw new Exception("Invalid Input");
    	}
          lastDigit = binary%10;       //Get last digit 
          decimal += lastDigit*Math.pow(2, count);  
          binary = binary/10;  
          count++;  
      }  
      return decimal;  
	}
}
/*
public static void main(String args[]){    

System.out.println("Decimal of 100101 is : " +getDecimal(-10));  

}}    
*/