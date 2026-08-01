package classwork;

// Book details class
class BookData {
    String title;
    String author;
    double price;

    // Constructor
    BookData(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println();
    }
}

// Main class
public class Book {

    public static void main(String[] args) {

        BookData b1 = new BookData("Shinchan", "Anamika", 550);
        BookData b2 = new BookData("Tom and Gerry", "Alex Mathew", 450);

        b1.displayBook();
        b2.displayBook();
    }
}