public class Main {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jkrowling@gmail.com", 'F');
        Book book = new Book("Harry Potter & the Sorceror's stone", author, 375.95, 3);
        book.displaydetails();
    }
}