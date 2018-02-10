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

//		StudentView studentView = new StudentView();
//		StudentController controller = new StudentController(student, studentView);
//		controller.printStudentDetails(); //initial print of student details
//
//		student.removeCourse(CSAS4118);
//		student.removeCourse(CSAS4119);
//		controller.printStudentDetails(); //prints out an error message because only enrolled in 1 course
//
//		student.addCourse(CSAS4119);
//		controller.printStudentDetails(); //prints information again with 2 courses
//
//		CourseView courseView = new CourseView();
//		CourseController courseController = new CourseController(CSAS4117, courseView);
//		courseController.printCourseDetails(); // Prints out all of the information about a course
//
//		Student student = new Student("Garett", "Chang", 123456, "changgar@shu.edu");

		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		EmailObserver emailObserver = new EmailObserver();

		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(emailObserver);

		student.setFirstName("Zo");
		student.setIdNumber(11991188);
		student.setEmail("zohar.suslovich@shu.edu");
		student.addCourse(CSAS4118);
		student.addCourse(CSAS4119);
		student.removeCourse(CSAS4117);

	}

}
