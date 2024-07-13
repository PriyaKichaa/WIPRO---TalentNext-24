import java.util.*;
/*
Q16 Write a program to reverse a given number and print.
 Example1)  I/P: 1234 O/P:4321
 Example2)  I/P:1004 O/P:4001

*/

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, r = 0;
        
        while (n != 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        
        System.out.println(rev);
    }
}
