import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	String file1;
	String file2;
	/*private BufferedReader reader;
	private PrintWriter writer;*/
	private static Scanner sc;
	private File reader;
	private File writer;
	
	public Main(String input1, String input2) {
		file1=input1;
		file2=input2;
	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter file names");

		String input1= sc.nextLine();
		String input2= sc.nextLine();
		
		Main obj= new Main(input1,input2);
		obj.copyFiles();
	}
	
	public void copyFiles(){
		reader = new File(file1);
		writer = new File(file2);
		
		if(!reader.exists()){
			System.out.println(file1+"File does not exist.Enter input file name");
			 file1= sc.nextLine();
			 copyFiles();
		}
		
		try {
			Files.copy(Paths.get(file1),new FileOutputStream(file2));
			if(writer.exists()){
			
				System.out.println("Files copied successfully");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Enter output file name");
			file2= sc.nextLine();
			copyFiles();
		}
		
		
	}
}
