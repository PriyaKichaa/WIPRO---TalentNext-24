import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER BOOK DETAILS");
        
        System.out.println("Enter the Book name: ");
        String bookname = sc.nextLine();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter author name: ");
        String authorname = sc.nextLine();3
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter gender: ");
        char gender = sc.next().charAt(0);

        Author author = new Author(authorname, email, gender);    
        Book book = new Book(bookname, author, price);
        book.display();
    }
}