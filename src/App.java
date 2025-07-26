public class App {
    public static void main(String[] args) throws Exception {
        MathCourse math = new MathCourse("Mathematices", 80,90);
		math.setId(101);
		math.setName("Gunasekaran");
		math.setGrade('A');
		
		ScienceCourse science = new ScienceCourse("Science", 75, 85);
		science.setId(102);
		science.setName("Arun");
		science.setGrade('B');
		
		Course[] courses = { math, science};
		
		for(Course c : courses){
		    c.showCourseInfo();
		    System.out.println("Student ID: "+c.getId());
		    System.out.println("Name: "+c.getName());
		    System.out.println("Grade: "+c.getGrade());
		    System.out.println("Score: "+c.calculateFinalScore());
		    
		    
		    if ( c instanceof Reportable){
		        ((Reportable) c).generateReport();
		    }
		    System.out.println();
		}
    }
}
