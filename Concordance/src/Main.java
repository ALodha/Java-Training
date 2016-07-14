import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
	private static BufferedReader reader;
	private static FileReader in;
	static String[] line;
	static HashMap <String,Integer> map= new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			in = new FileReader("Pride & Prejudice.txt");
			reader = new BufferedReader(in);

			while(reader.readLine()!=null){
				line=reader.readLine().split(" ");
				for(int index=0;index<line.length;index++){
					if(map.containsKey(line[index])){
						int value= map.get(line[index])+1;
						map.put(line[index],value);
					}else{
						map.put(line[index],1);
					}
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String key: map.keySet()){
			System.out.println("The word "+key+" occurs "+map.get(key)+" times");
		}
	}

}
