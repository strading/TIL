package hw.Prob6;

public class Book {
	
	private String title;
	private int price;
	
	Book () {
		this("", 0);
	}
	
	Book (String title, int price) {
		this.setTitle(title);
		this.setPrice(price);
	}

	public String getTitle() {
		return this.title;
	}

	public int getPrice() {
		return this.price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}