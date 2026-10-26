class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void displayInformation() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pages);
    }
}

    public class ConstructorsAndTheThisKeyword {
    public static void main(String[] args) {
        Book book1 = new Book("This Books Loves You", "Pewdiepie", 250);

        book1.displayInformation();
    }
}
