import java.util.Scanner;

/*
Q10 Write a program to print numbers from 1 to 10 in a single row with one tab space.
*/


public class PrintTill10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
    }
}