import java.util.concurrent.ThreadLocalRandom;

public class Main {

	
	private int[] array= new int[3];

	public enum STATES{BAR,MEDAL,COIN,TRIPLEBAR,CHERRY};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj= new Main();
		obj.spin();
	}
	
	public int randomNumberGenerator(){
		return ThreadLocalRandom.current().nextInt(0, 4);
	}

	public void spin(){
		for(int index=0;index<3;index++){
		
			int number=randomNumberGenerator();
			array[index]=number;
			System.out.println(STATES.values()[number]);
		}
		
		
	}
}
