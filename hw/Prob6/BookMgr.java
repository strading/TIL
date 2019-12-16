package hw.Prob6;

/**
 * 
 * @author student
 * 
 * Book[] list	: list for class Book
 * int size		: list's size
 * int books	: index of list
 * 				  (not null)
 *
 */
public class BookMgr {
	
	private Book[] list;
	private int size;
	private int books;
	
	BookMgr () {
		this.size = 5;
		this.list = new Book[this.size];
		this.books = 0;
	}
	
	public void addBook ( Book book ) {
		if ( books == size ) {
			Book[] temp = new Book[this.size+5];
			System.arraycopy(this.list, 0, temp, 0, this.list.length);
//			for (int i = 0; i < this.list.length; i++) {
//				temp[i] = list[i];
//			}
			this.list = temp;
			this.size += 5;
		}
		if ( !(book.getTitle().equals("") && book.getPrice()==0) ) {
			this.list[books++] = book;
		}
	}
	
	public void printBookList() {
		System.out.println("==== Book List ====");
		for (Book book :list) {
			if(book == null)
				break;
			System.out.println(book.getTitle());
		}
		System.out.print("[ Number of books : ");
		System.out.print(this.books);
		System.out.println(" ]\n");
	}
	
	public void printTotalPrice() {
		System.out.println("==== Total Price ====");
		int sum = 0;
		for (Book book :list) {
			if(book == null)
				break;
			sum += book.getPrice();
		}
		System.out.printf("Our Books Total Price : %,d\n", sum);
		System.out.println();
	}
	
}
