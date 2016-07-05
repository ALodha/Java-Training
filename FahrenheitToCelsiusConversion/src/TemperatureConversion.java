/**
 * 
 */

/**
 * @author alodha
 *
 */
import java.util.Scanner;

public class TemperatureConversion {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter temperature in fahrenheit: ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		double fah= Double.valueOf(line);
		double cel= 5*(fah-32)/9;
		
		System.out.println("Temperature in celsius is: "+ cel);
	}

}
