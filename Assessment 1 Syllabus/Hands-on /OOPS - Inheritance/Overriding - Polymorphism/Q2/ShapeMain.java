public class ShapeMain {
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();
        System.out.println("--------");
        System.out.println("~ Circle methods");
        c.draw();
        c.erase();
        System.out.println("--------");
        System.out.println("~ Triangle methods");
        t.draw();
        t.erase();
        System.out.println("--------");
        System.out.println("~ Square methods");
        s.draw();
        s.erase();
    }
}
