package ObserverPatternDemo;

import java.util.ArrayList;

public class Professor {

    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private ArrayList<Course> courses;

    public Professor(String first, String last, String email, int phone){
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.phone = phone;
    }
    public Professor(){
        this.courses = new ArrayList<Course>();
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone(){
        return this.phone;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public void addCourse(Course course){
        if (!this.courses.contains(course))
            this.courses.add(course);
        else
            System.out.println("This Course is already taught by this professor");
    }

    public void removeCourse(String name){
        this.courses.remove(name);
    }

}
