
import java.util.Arrays;
import java.util.Scanner;

public class DataAnalysis {

	private int length;
	private Scanner sc;

	public static void main(String[] args) {
	
		DataAnalysis object= new DataAnalysis();
		object.prepareInput();

	}
	
	/*
	 * Used to create the array on which data analysis will be performed 
	 **/
	public void prepareInput(){
		
		sc = new Scanner(System.in);
		System.out.println("Enter the number of data items");
		
		length= sc.nextInt();
		
		int[] array= new int[length];
		int index=0;
		
		while(index<length){
			
			System.out.println("Enter data item "+index+":");
			array[index]=sc.nextInt();
			index++;
		}
		
		dataAnalysis(array);
		
	}

	/*
	 * Used to calculate the mean and store the min and max values while traversing the array
	 * 
	 * */
	public void dataAnalysis(int[] array) {

		int sum=0;
		int min=0;
		int max=0;
		
		for(int index=0;index<array.length;index++){
			
			sum+= array[index];
			if(index==0){
				min= array[index];
				max=array[index];
						
			}else{
				if(array[index]<min)
				{
					min=array[index];
				}else if(array[index]>max){
					max=array[index];
				}
				
			}
			
		}	
		
		int mean= sum/array.length;
		System.out.println("Mean is"+mean);
		System.out.println("Minimum data item is"+min);
		System.out.println("Maximum data item is"+max);
	}

}
