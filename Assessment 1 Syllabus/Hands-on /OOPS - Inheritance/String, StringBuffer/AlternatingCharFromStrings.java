/*
9.	Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. Any characters left, will go to the end of the result.
Example1)
i/p: Hello,World
o/p: HWeolrllod

*/
import java.util.Scanner;

public class AlternatingCharFromStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String result = "";
		int j = 0;
		for(int i=0;i<str2.length();i++){
			if(i<str1.length()){
				result += str1.charAt(i);
			}
			if(j<str2.length()){
				result += str2.charAt(j);
				j++;
			}
		}
		System.out.println(result);
	}
}

