package homeworkDay2;

public class Category {

	public Category() {
		System.out.println("Category çalıştırıldı!");
	}

	public Category(String categoryName, int categoryId) {
		this();
		this.categoryName = categoryName;
		this.categoryId = categoryId;
	}

	String categoryName;
	int categoryId;
}
