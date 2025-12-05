public class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        System.out.println("Default Constructor:");
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    Book(String t, String a) {
        title = t;
        author = a;
        price = 0.0;
        System.out.println("Constructor with Title and Author:");
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        System.out.println("Constructor with All Fields:");
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("Clean Code", "Robert C. Martin", 450.75);
    }
}
