package homeworkDay2;

public class Category {

	public Category() {
		System.out.println("Category �al��t�r�ld�!");
	}

	public Category(String categoryName, int categoryId) {
		this();
		this.categoryName = categoryName;
		this.categoryId = categoryId;
	}

	String categoryName;
	int categoryId;
}
