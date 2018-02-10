package ObserverPatternDemo;

public class Course {

    private String courseName;
    private int courseNumber;
    private int credits;
    private Professor professor;

    public Course (String name, int number, int credits, Professor professor){
        this.courseName = name;
        this.courseNumber = number;
        this.credits = credits;
        this.professor = professor;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String name){
        this.courseName = name;
    }

    public int getCourseNumber(){
        return this.courseNumber;
    }

    public void setCourseNumber(int number){
        this.courseNumber = number;
    }

    public int getCredits(){
        return this.credits;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
