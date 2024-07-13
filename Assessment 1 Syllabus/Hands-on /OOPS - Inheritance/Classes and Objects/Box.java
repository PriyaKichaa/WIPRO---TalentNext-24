import java.util.*;
/*
Create a class Box that uses a parameterized constructor to initialize the dimensions of a box. 
The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities.

*/

public class Box{
    int width;
    int depth;
    int height;
    Box(int width, int depth, int height){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    public int volume(){
        return width * depth * height;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter box dimensions: ");
        int width = sc.nextInt();
        int depth = sc.nextInt();
        int height = sc.nextInt();

        Box box = new Box(width, depth, height);
        System.out.println("Volume of the box is: " + box.volume());
    }
}
