import java.util.*;

/*
Q15 Write a program to print * in Floyds format (using for and while loop)
*
* *
* * *
Example1) C:\>java Sample
O/P: Please enter an integer number Example2) C:\>java Sample 3
O/P :
*
* *
* * *

*/

public class FloydFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}