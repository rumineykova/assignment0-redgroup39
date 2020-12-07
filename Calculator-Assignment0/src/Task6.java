public class Task6 {
public static int getDecimal(int binary){  
    int decimal = 0;  
    int count = 0;
    int lastDigit; 

    while(binary != 0){  
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