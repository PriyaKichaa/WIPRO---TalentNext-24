/*
Q1-B Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/

import java.util.Scanner;

public class Checklastdigit {
    public static boolean lastDigit(int n, int digit) {
        if (n % 10 == digit)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        System.out.print("Enter last digit: ");
        int dig = sc.nextInt();
        System.out.println(lastDigit(n, dig));
    }
}