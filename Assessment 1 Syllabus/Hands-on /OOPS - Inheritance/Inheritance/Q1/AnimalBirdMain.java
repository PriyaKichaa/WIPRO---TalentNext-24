public class AnimalBirdMain {
    public static void main(String[] args) {
        System.out.println("Animal class methods");
        Animal a = new Animal();
        a.eat();
        a.sleep();

        System.out.println("------------");
        
        System.out.println("Bird class methods");
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}