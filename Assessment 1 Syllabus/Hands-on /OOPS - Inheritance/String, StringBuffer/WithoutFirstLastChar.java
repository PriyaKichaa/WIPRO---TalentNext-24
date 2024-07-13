import java.util.Scanner;
/*
Write a java program that accepts a string and 
returns a new string without the first and last character of the input string.

Example1)
	i/p: Suman
	o/p: uma
*/

public class WithoutFirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = null;
        if(str.length()>2){
            res = str.substring(1, str.length()-1);
        }
        System.out.println(res);
    }
}
