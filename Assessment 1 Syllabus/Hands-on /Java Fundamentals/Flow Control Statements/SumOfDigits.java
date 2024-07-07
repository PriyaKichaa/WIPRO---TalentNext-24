import java.util.Scanner;

/*
Q14 Write a program to print the sum of all the digits of a given number.
Example1) I/P:1234
O/P:10
*/

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int r = 0;
        
        while (n != 0) {
            r = n % 10;
            sum += r;
            n /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}
