package assignmentDayTwo;

public class Course {
	
	public Course () {
		//System.out.println("");
	}
	
	
	//constructor
	public Course (int id, String name, String instructor,
			 String detail,int percentageOfCompletion) { 
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.detail = detail;
		this.percentageOfCompletion = percentageOfCompletion;
		
	}
	
	
	    int id;  
		String name;
	    String instructor;
	    String detail;
	    int percentageOfCompletion;
}
