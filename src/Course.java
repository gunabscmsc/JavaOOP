public abstract class Course extends Student {
    String courseName;
    Course(String courseName){
        this.courseName=courseName;
    }
    abstract double calculateFinalScore();
    void showCourseInfo(){
        System.out.println("Course Name: "+courseName);
    }
}
