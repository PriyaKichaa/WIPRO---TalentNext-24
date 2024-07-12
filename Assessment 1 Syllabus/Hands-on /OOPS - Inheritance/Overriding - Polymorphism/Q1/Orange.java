public class Orange extends Fruit{ 
    Orange(){
        super("Orange", "Sour", "5");
    }
    @Override
    void eat(){
        System.out.println("Fruit name: "+name);
        System.out.println("Orange taste: "+taste);
        System.out.println("Orange size: "+size);
    }
}
