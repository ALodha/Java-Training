/**
 * 
 */

/**
 * @author alodha
 *
 */
import java.util.Scanner;
public class CalculateDay {

	String day;
	String month;
	String year;
	Weekday dayOfWeek;
	private static Scanner sc;
	public enum Weekday {SATURDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY};
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		CalculateDay object= new CalculateDay();
		
		/*
		 * Store user input into data members. End the application if the user
		 * types quit
		 * */
		while(true){
			System.out.println("Hello! Enter day, month and year");
		    object.day= sc.nextLine();
			if(object.day.equalsIgnoreCase("quit")){
				System.out.println("You quit the application");
				break;
			}
			object.month= sc.nextLine();
			if(object.month.equalsIgnoreCase("quit")){
				System.out.println("You quit the application");
				break;
			}
			object.year= sc.nextLine();
			if(object.year.equalsIgnoreCase("quit")){
				System.out.println("You quit the application");
				break;
			}else{
				object.prepareInput();
			}
		}
		
	}
	
	/*
	 * Perform the changes required to the input according to Zeller's congruence
	 * */
	public void prepareInput(){
		if(validateInput()){
			int d= Integer.valueOf(day);
			int m= Integer.valueOf(month);
			int y= Integer.valueOf(year);
			
			if(m<3){
				m=m+12;
				y=y-1;
			}
			
			calculateDay(d,m,y);
		}
	}

	/*
	 * Validate the input to ensure that day is between 1-31,
	 * month is between 1-12 & year is positive integer between 999-9999
	 * */
	public boolean validateInput(){
		if(day =="" || month=="" || year==""){
			System.out.println("Entered values contain null");
			return false;
		}
		if(Integer.valueOf(day)>31 || Integer.valueOf(day)<1 ){
			System.out.println("Incorrect day entered");
			return false;
		}
		if(Integer.valueOf(month)>12 || Integer.valueOf(month)<1){
			System.out.println("Incorrect month entered");
			return false;
		}
		if(Integer.valueOf(year)<1000 || Integer.valueOf(year)>9999){
			System.out.println("Incorrect year entered");
			return false;
		} 
		return true;
	}
	
	/*
	 * Calculate the day using Zeller's Congruence method
	 * */
	public void calculateDay(int day, int month, int year){
		int a= (26*(month+1))/10;
		int b= year/4;
		int c= 6* (year/100);
		int d=year/400;
		
		int sum = a+b+c+d+day+year;
		int dayOfWeek=sum%7;
		
		printDayOfWeek(dayOfWeek);
	}
	
	/*
	 * Print the day of week stored in the enum
	 * */
	public void printDayOfWeek(int value){
		
		switch(value){
		
		case 0: {
				dayOfWeek= Weekday.SATURDAY;
				break;
		}
		case 1: {
			dayOfWeek= Weekday.SUNDAY;
			break;
		}
		case 2: {
			dayOfWeek= Weekday.MONDAY;
			break;
		}
		case 3: {
			dayOfWeek= Weekday.TUESDAY;
			break;
		}
		case 4: {
			dayOfWeek= Weekday.WEDNESDAY;
			break;
		}
		case 5: {
			dayOfWeek= Weekday.THURSDAY;
			break;
		}
		case 6: {
			dayOfWeek= Weekday.FRIDAY;
			break;
		}
	  }
	System.out.println("It was a "+ dayOfWeek);
	}
}

