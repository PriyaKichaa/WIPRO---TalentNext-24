import java.util.*;
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