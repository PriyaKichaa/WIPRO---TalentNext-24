public class Main{
    public static void main(String[] args) {
        System.out.println("~ Fruit class eat()");
        Fruit fruit = new Fruit("Generic Fruit", "Usually sweet and/or sour", "Undefined");
        fruit.eat();
        System.out.println("----------");

        System.out.println("~ Apple class eat()");
        Apple apple = new Apple();
        apple.eat();
        System.out.println("----------");

        System.out.println("~ Orange class eat()");
        Orange orange = new Orange();
        orange.eat();
        System.out.println("----------");

        System.out.println("~ Fruit class eat()");
        fruit.eat();
    }
}