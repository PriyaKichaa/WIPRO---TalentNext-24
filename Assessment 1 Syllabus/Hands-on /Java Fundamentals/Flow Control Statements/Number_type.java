import java.util.*;

/*
Q1-A Write a program to check if a given integer number is Positive, Negative, or Zero.
*/


public class Number_type {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n == 0) {
			System.out.println("Zero");
		} else if (n > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}
}
