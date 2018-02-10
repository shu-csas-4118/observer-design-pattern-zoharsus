package ObserverPatternDemo;

import java.util.ArrayList;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor Garett = new Professor("Garett", "Chang", "gachang@shu", 5550101);

		Course CSAS4117 = new Course("Software Engineering I", 1, 3, Garett);
		Course CSAS4118 = new Course("Software Engineering II", 2, 3, Garett);
		Course CSAS4119 = new Course("Software Engineering III", 3, 4, Garett);

		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(CSAS4117);

		Student student = new Student("Zohar", "suslovich", 11161694, "zoharsus@gmail.com",courses );

		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseObserver courseObserver = new CourseObserver();

		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseObserver);

		student.setFirstName("Zo");
		student.setIdNumber(11991188);
		student.setEmail("zohar.suslovich@shu.edu");
        student.addCourse(CSAS4118);
        student.addCourse(CSAS4119);
		student.removeCourse(CSAS4117);

	}

}
