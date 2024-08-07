package assignment.secondday;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library a = new Library();
		String booktitle = ("ramayanam");
		a.addBook(booktitle);
		a.issueBook();
	}
}
