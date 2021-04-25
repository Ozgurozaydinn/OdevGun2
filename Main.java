package homeworkDay2;

public class Main {

	public static void main(String[] args) {

		Category category1 = new Category("T�m�", 1);
		Category category2 = new Category("Programlama", 2);

		Category[] categories = { category1, category2 };

		for (Category category : categories) {
			System.out.println(category.categoryName);
		}

		Course course1 = new Course("C# + Angular Kursu", "2 ayda sekt�r�n y�kseklerine", "Engin Demiro�", "�cretsiz");
		Course course2 = new Course("Java + React Kursu", "2 ayda sekt�r�n y�kseklerine", "Engin Demiro�", "�cretsiz");

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println(course.courseName);
		}

		CourseManager courseManager = new CourseManager();
		courseManager.joinToCourse(course1);
		courseManager.joinToCourse(course2);
	}

}
