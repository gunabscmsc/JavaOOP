public class ScienceCourse extends Course implements Reportable {

    double labScore, theoryScore;
    
    ScienceCourse(String courseName, double labScore, double theoryScore){
        super(courseName);
        this.labScore=labScore;
        this.theoryScore=theoryScore;
    }
    public double calculateFinalScore(){
        return (labScore * 0.5 + theoryScore * 0.5);
    }
    public void generateReport(){
        System.out.println("Geneating Science Course Report");
        System.out.println("Final Score: "+ calculateFinalScore());
    }
}
