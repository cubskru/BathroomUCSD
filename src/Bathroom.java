
public class Bathroom{
	private String College;
	private String Building;
	private	String Level;
	
	private Boolean isMale;
	private Boolean isWheelChair;
	private Boolean isFamily;
	private int Rating;

	private int numberOfRatings;

	public Bathroom(){
		this.College = null;
		this.Building = null;
		this.Level = null;
		this.Rating = 0;
		this.numberOfRatings = 0;
	}
	
	public Bathroom(String College, String Building, String Level, Boolean isMale, Boolean isWheelChair, Boolean isFamily, 
			int Rating){
		
		this.College = College;
		this.Building = Building;
		this.Level = Level;
		this.isMale = isMale;
		this.isWheelChair = isWheelChair;
		this.isFamily = isFamily;
		this.Rating = Rating;
		this.numberOfRatings = 1;
	}

	public String getCollege(){
		return this.College;
		
	}
		
	public String getBuilding(){
		return this.Building;
	}

	public String getLevel(){
		return this.Level;
	}
	
	public String getGender(){
		if(this.isMale){
			return "Male";
		}
		else{
			return "Female";
		}
					
	}

	public Boolean getWheelChair(){
		return this.isWheelChair;
	}


	public int getRating(){
		return this.Rating;
	}

	
	public void setRating(int newRating){
		int totalPoints = (this.Rating * numberOfRatings) + newRating;
		this.numberOfRatings++;
		newRating = totalPoints / (this.numberOfRatings);
		
		this.Rating = newRating;
		
	}
	

}

