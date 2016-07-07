/**
 * 
 */

/**
 * @author alodha
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Reading {

	String dayOfWeek;
	int hourOfDay;
	int temperature;
	int windSpeed;
	
	//Temp temps;
	//Time time;
	
	public enum Temp {cold,mild,warm,hot;};
	public enum Time {morning,afternoon,evening;};
	
	public Reading(String line) {
		
		String[] elements= line.split(", ");
		dayOfWeek=elements[0];
		hourOfDay=Integer.valueOf(elements[1]);
		temperature= Integer.valueOf(elements[2]);
		windSpeed=Integer.valueOf(elements[3]);
		
		//System.out.println(line);
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		try{
			
			BufferedReader br = Files.newBufferedReader(Paths.get("weather.csvx"));
			    Reading[] readings = new Reading[12];
			    String line;
			    for (int i = 0; i < readings.length; i++) {
			        readings[i] = new Reading(br.readLine());
			        
			        line=readings[i].dayOfWeek+" "+readings[i].getTime()+" was "+readings[i].rateTemperature();
			        System.out.println(line);
			    }
			    
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public String rateTemperature(){
		if(temperature<55)
			return Temp.values()[0].toString();
		else if (temperature<65)
			return Temp.values()[1].toString();
		else if (temperature<80)
			return Temp.values()[2].toString();
		else return Temp.values()[3].toString();
		
	}
	
	public String getTime(){
		
		if(hourOfDay==9)
			return Time.values()[0].toString();
		else if (hourOfDay==15)
			return Time.values()[1].toString();
		else return Time.values()[2].toString();
		
	}

}
