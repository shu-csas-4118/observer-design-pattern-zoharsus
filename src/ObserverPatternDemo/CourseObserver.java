package ObserverPatternDemo;

public class CourseObserver implements IObserver{
    private Student student;

    public CourseObserver(){

    }
    public void update(Student student){
        System.out.println("Student's list of courses are:");
        for (Course course : student.getCourses()) {
            System.out.println(course.getCourseName() + " Taught by " + course.getProfessor().getFirstName() + " " + course.getProfessor().getLastName() + "%n");
        }
    }
}
