/*

 
10.	Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
Example1)
i/p:	Wipro,3
o/p:	propropro

*/
import java.util.Scanner;

public class LastNRepsOfNChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		StringBuilder res = new StringBuilder();
		for(int i=0;i<n;i++){
			res.append(str.substring(str.length()-n, str.length()));
		}
		System.out.println(res);
	}
}