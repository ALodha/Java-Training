import java.util.Scanner;

public class Main {

	public enum MONTHS {JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER};
	int day[]={31,28,31,30,31,30,31,31,30,31,30,31};
	private static Scanner sc;

	public static void main(String[] args) {
		
		while(true){
			
			System.out.println("Enter month and day");
			sc = new Scanner(System.in);
			
			String month= sc.nextLine();
			month=month.toUpperCase();
			int day= sc.nextInt();
			
			Main obj= new Main();
			
			if(month.equalsIgnoreCase("quit")){
				System.out.println("You are quitting the application");
				break;
			}else{
				
				try {
					obj.validateInput(month,day);
				} catch (Exception e){
					System.out.println(e.getMessage());
				}
				
			}
			
		}
		
	}

	public void validateInput(String month, int dayNumber) throws BadMonth, BadDay{
		try{
			
			MONTHS.valueOf(month);
			int index= MONTHS.valueOf(month).ordinal();
			
				if(dayNumber>day[index-1]){
					throw new BadDay();
				}
				
				System.out.println("Correct day & month");
			
		}catch(Exception e){
			throw new BadMonth();
		}
		
	}

}

@SuppressWarnings("serial")
class BadMonth extends Exception{
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		String output= "Incorrect month";
		return output;
	}
}

@SuppressWarnings("serial")
class BadDay extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		String output= "Number of days entered is incorrect";
		return output;
	}
}