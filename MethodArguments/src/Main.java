import java.util.Arrays;

public class Main {
	
	static String[] numbers= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
	

/*
 * The last call which takes 1 and three as arguments does not work because there is no method which 
 * takes integer and string as arguments. 
 * 
 * The other method calls work perfectly because there are methods that take those arguements
 * When the first method is called, since both arguments are double it calls the function which takes 
 * two double parameters
 * 
 * The second function call, calls the method which takes two integers as input and the third one 
 * calls the method that takes two strings as input.
 *
 * The fourth function call, calls the method which takes two doubles as input because Java allows
 * implicit conversion between integers and doubles. So 2 is treated as double instead of integer.This is 
 * known as Autoboxing.
 * 
 * */
	public static void main(String[] args) {
				
	/*
	 * The method with zero arguments throws an error as it is ambiguous. All three addUp methods can 
	 * accept zero inputs, hence the compiler cannot decide which function should be called.
	 * */	
		
		//Main.addUp();
		Main.addUp(3.2);
		Main.addUp(3.2,4.5);
		Main.addUp(3.2,6.5,3.4);
		
		Main.addUp("one");
		Main.addUp("one", "three");
		Main.addUp("one", "three","four","zero");
		
		
		Main.addUp(2);
		Main.addUp(2,3);
		Main.addUp(2,4,6);
		
		//Main.addUp(1, "three");

	}
	
/*	
 * Part of Lab 2- Overloaded Methods
 * 
 * public static int addUp(int a, int b){
		
		System.out.println("Method taking integers");
		int c= a+b;
		System.out.println(c);
		return c;
	}
	
	public static double addUp(double a, double b){
		
		System.out.println("Method taking doubles");
		double c= a+b;
		System.out.println(c);
		return c;
	}
	
	public static int addUp(String a, String b){
		
		System.out.println("Method taking strings");
		
		int first= toNumber(a);
		int second= toNumber(b);
		System.out.println(first+second);
		return first+second;
	}*/
	
	public static int addUp(int...values){
		System.out.println("Method taking integer");
		
		int addition = 0;
		for(int value:values){
			
			addition+=value;
			return addition;
		}
		return 0;
		
	}
	
	public static double addUp(double... values){
		System.out.println("Method taking double");
		
		double addition = 0;
		for(double value:values){
			
			addition+=value;
			return addition;
		}
		return 0;
	}
	
	public static int addUp(String...values){
		
		System.out.println("Method taking strings");
		
		int addition = 0;
		for(String value:values){
		
			addition+=toNumber(value);
			return addition;
		}
		return 0;
		
		
	}
	public static int toNumber(String s){
		
		return Arrays.asList(numbers).indexOf(s);
		 
	}
}
