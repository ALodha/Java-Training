import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*sc = new Scanner(System.in);
		System.out.println("Enter values for the system");
		String name= sc.nextLine();
		int age= sc.nextInt();
		Boolean gender=sc.nextBoolean();
		String number=sc.nextLine();
		String comment=sc.nextLine();
		*/
				
		Target.Builder builderObj= new Target.Builder("abc",26,false,"9876543210","correct");
		Target requiredObj=builderObj.build();
		System.out.println("Object created successfully"+requiredObj.name);
		
		Target.Builder builderObj2= new Target.Builder("pqr",12,false,"9876543210","correct");
		Target requiredObj2=builderObj2.build();
		System.out.println("Object not created"+requiredObj2.name);
		
	}

}

