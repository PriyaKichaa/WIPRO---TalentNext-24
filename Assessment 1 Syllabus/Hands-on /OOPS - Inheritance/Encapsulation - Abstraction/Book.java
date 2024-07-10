public class Book extends Author{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void display(){
        System.out.println("Book Name: "+getName());
        System.out.println("Author Name: "+author.getName());
        System.out.println("Author Email: "+author.getEmail());
        System.out.println("Author gender: "+author.gender);
        System.out.println("Price: "+getPrice());
        System.out.println("Quantity: "+getQtyInStock());

    }
}