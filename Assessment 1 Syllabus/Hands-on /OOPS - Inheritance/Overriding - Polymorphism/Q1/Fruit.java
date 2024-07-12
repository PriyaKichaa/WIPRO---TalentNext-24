public class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat(){
        System.out.println("Fruit name: "+name);
        System.out.println("Fruit taste: "+taste);
        System.out.println("Fruit size: "+size);
    }
}
