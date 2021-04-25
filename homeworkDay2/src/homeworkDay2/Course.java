package homeworkDay2;

public class Course {

	public Course() {
		System.out.println("Kurs çalýþtýrýldý!");
	}

	public Course(String courseName, String explanation, String instructor, String price) {
		this();
		this.courseName = courseName;
		this.explanation = explanation;
		this.instructor = instructor;
		this.price = price;
	}

	String courseName;
	String explanation;
	String instructor;
	String price;

}
