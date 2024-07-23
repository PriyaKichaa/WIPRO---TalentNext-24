/*
8.	Write a Java program that accepts a string (with * in it). 
    The program should return a new string in which the following characters are removed 
			-* , the characters that are to the left and right of *
Example1)
		i/p: ab*cd
		o/p: ad

*/
import java.util.Scanner;

public class RemoveStarAndCharNear {
	static String removeStar(int i, String str){
		StringBuilder sb = new StringBuilder(str);
		if(i==0){
			sb.deleteCharAt(i);
			if(i<sb.length()){
				sb.deleteCharAt(i);
			}
		}
		else if(i>0 && i<sb.length()-1){
			sb.deleteCharAt(i-1);
			sb.deleteCharAt(i-1);
			sb.deleteCharAt(i-1);
		}
		else{
			sb.deleteCharAt(i);
			sb.deleteCharAt(i-1);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = 0;
		while(i<str.length()){
			if (str.charAt(i)=='*'){
				str = removeStar(i, str);
				i = 0;
			}
			i++;
		}
		System.out.println(str);
	}
}



