
public class Target {

	public String name; 
	public int age;
	public boolean isMale;
	public String mobileNumber;
	public String comments;
	
	public Target(Builder object) {
		// TODO Auto-generated constructor stub
		name=object.nestedName;
		age=object.nestedAge;
		isMale=object.nestedIsMale;
		mobileNumber=object.nestedMobileNumber;
		comments=object.nestedComments;
	}

	private boolean isValid() throws notValid{
		
		if("".equals(name)){
			throw new notValid();
		}else if (age<18){
			throw new notValid();
		}else if(mobileNumber.length()<5){
			throw new notValid();
		}else if("".equals(comments)){
			throw new notValid();
		}else{
			return true;
		}
		
	}
	
	public static class Builder{
		
		public String nestedName; 
		public int nestedAge;
		public boolean nestedIsMale;
		public String nestedMobileNumber;
		public String nestedComments;
		

		public Builder(String name, int age, boolean isMale,String number,String comments){
			this.setName(name);
			this.setAge(age);
			this.setGender(isMale);
			this.setMobile(number);
			this.setComments(comments);
			
		}
		
		public void setName(String name){
			nestedName= name;
			
		}
		public void setAge(int age){
			nestedAge= age;
			
		}
		
		public void setGender(boolean gender){
			nestedIsMale=gender;
		}
		
		public void setMobile(String number){
			nestedMobileNumber=number;
		}
		
		public void setComments(String comments){
			nestedComments=comments;
		}
		
		public Target build(){
			Target targetObject= new Target(this);
			try {
				if(targetObject.isValid()){
					return targetObject;
				}
			} catch (notValid e) {

				System.out.println(e.getMessage());
			}catch (Exception e){
				System.out.println("Please enter correct values");
			}
			return null;
			
		}
	}
}

@SuppressWarnings("serial")
class notValid extends Exception{
	
	public notValid(){
		System.out.println("Incorrect values");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Please enter correct values";
	}
} 
