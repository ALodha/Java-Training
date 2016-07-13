
public class Main {

	public static void main(String[] args) {
		Photographers[] array= new Photographers[4];
		array[0]= new PersonalPhotographer();
		array[1]=new DronePhotographer();
		array[2]=new Surveillance();
		array[3]=new TollPhotographer();
		
		for(int index=0;index<4;index++){
			array[index].prepareScene();
			System.out.println(array[index].takePhoto());
		}
				
	}

}

class PersonalPhotographer implements Photographers{

	@Override
	public void prepareScene() {
		// TODO Auto-generated method stub
		System.out.println("Smile brighter");
	}

	@Override
	public String takePhoto() {
		// TODO Auto-generated method stub
		String message= "Family photo taken";
		return message;
	}
	
}

class DronePhotographer implements Photographers{

	@Override
	public void prepareScene() {
		// TODO Auto-generated method stub
		System.out.println("Clear the skies");
	}

	@Override
	public String takePhoto() {
		String message= "Scenic photo taken";
		return message;
	}
	
}

class Surveillance implements Photographers{

	@Override
	public void prepareScene() {
		// TODO Auto-generated method stub
		System.out.println("You are being watched");
	}

	@Override
	public String takePhoto() {
		String message= "Street's photo taken";
		return message;
	}
	
} 

class TollPhotographer implements Photographers{

	@Override
	public void prepareScene() {
		// TODO Auto-generated method stub
		System.out.println("Slow down");
	}

	@Override
	public String takePhoto() {
		String message= "Photos of car crossing the toll taken";
		return message;
	}
	
}