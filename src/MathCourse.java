public class MathCourse extends Course implements Reportable {

    double midterm, filnalExam;
    
    MathCourse(String courseName, double midterm, double filnalExam){
        super(courseName);
        this.midterm=midterm;
        this.filnalExam=filnalExam;
    }
    public double calculateFinalScore(){
        return (midterm * 0.4 + filnalExam * 0.6);
    }
    public void generateReport(){
        System.out.println("Generating Math Course Report...");
        System.out.println("Final Score: " + calculateFinalScore());
    }
}
