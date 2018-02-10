package ObserverPatternDemo;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<IObserver> observers;
	private ArrayList<Course> courses;
	
	public Student(String firstName, String lastName, int idNumber, String email, ArrayList<Course> courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.observers = new ArrayList<IObserver>();
		this.courses = courses;
	}
	
	public Student() {
		this.observers = new ArrayList<IObserver>();
		this.courses = new ArrayList<Course>();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyAllObservers("firstName");
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
        notifyAllObservers("lastName");
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		notifyAllObservers("Id");
	}	
	
	public void setEmail(String email) {
		this.email = email;
		notifyAllObservers("Email");
	}
	
	public String getEmail() {
		return this.email;
	}

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
        notifyAllObservers("Course");
    }

    public void addCourse(Course course){
        if (!this.courses.contains(course)) {
            this.courses.add(course);
            notifyAllObservers("Course");
        }
        else {
            System.out.println("This Student is already enrolled in this course");
        }
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
        notifyAllObservers("Course");
    }
	
	public void attachObserver(IObserver observer) {
		this.observers.add(observer);
	}
	
	public void notifyAllObservers(String type) {

	    for(IObserver observer: this.observers) {
	        if (observer instanceof EmailObserver && type.equals("Email")) {
                observer.update(this);
            }
            if (observer instanceof IdNumberObserver && type.equals("Id")) {
                observer.update(this);
            }
            if (observer instanceof FirstNameObserver && type.equals("firstName")) {
                observer.update(this);
            }
            if (observer instanceof CourseObserver && type.equals("Course")) {
                observer.update(this);
            }
            if (observer instanceof LastNameObserver && type.equals("lastName")) {
                observer.update(this);
            }
		}
	}
	
	
}
