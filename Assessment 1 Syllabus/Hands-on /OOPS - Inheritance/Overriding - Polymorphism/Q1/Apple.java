public class Apple extends Fruit {
    Apple(){
        super("Apple", "Sweet", "10");
    }
    @Override
    void eat(){
        System.out.println("Fruit name: "+name);
        System.out.println("Apple taste: "+taste);
        System.out.println("Apple size: "+size);
    }
}
