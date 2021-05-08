package assignmentDayTwo;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme kampý 1"
				,"C# + Angular","Engin Demiroð",76); 
	   
		
		
		
		
		Course course2 = new Course(); 
		course2.id = 2;
		course2.name = ("Yazýlým Geliþtirici Yetiþtirme kampý 2");
		course2.detail = ("Java + React");
		course2.instructor = ("Engin Demiroð");
		course2.percentageOfCompletion = 60;
		
		
		
		Course course3 = new Course(); 
		course3.id = 3;
		course3.name = ("Programlamaya Giriþ Ýçin Temel Kurs");
		course3.detail = ("Sýfýrdan programlama");
		course3.instructor = ("Engin Demiroð");
		course3.percentageOfCompletion = 20;
		
		
		
		
		
		Course[] courses = {course1,course2,course3};
		System.out.println(courses.length);
		System.out.println("*******************************************");
		
	for (Course course : courses) {
		System.out.println(course.id);
		System.out.println(course.name);
		System.out.println(course.detail);
		System.out.println(course.instructor);
		System.out.println(course.percentageOfCompletion);
		System.out.println("*******************************************");
}
      
	
	
	CourseManager courseManager = new CourseManager();
	courseManager.addToResult(course1);
	
	courseManager.addToResult(course2);
	
	courseManager.addToResult(course3);
	
	
	
	}

}
