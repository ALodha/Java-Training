import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	
	private static BufferedReader reader;
	private static FileReader in;
	private static String[] line;
	private static Set<String> set = new HashSet<String>();
	
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		try {
			in = new FileReader("Pride & Prejudice.txt");
			reader = new BufferedReader(in);

			while(reader.readLine()!=null){
			
				line= reader.readLine().split("\\W");
				for(int index=0;index<line.length;index++){
					set.add(line[index]);
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(set);
		
	}

}
