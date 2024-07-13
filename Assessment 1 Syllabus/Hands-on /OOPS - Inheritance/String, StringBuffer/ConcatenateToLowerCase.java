import java.util.Scanner;

/*
Write a java program that will concatenate 2 strings and return the result. 
The result should be in lowercase.
	Note: If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
	i/p: Sachin, Tendulkar
         o/p: sachin tendulkar
Example2)
	i/p: Mark, kate
	o/p: markate

*/

public class ConcatenateToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char ch1, ch2;
        StringBuilder sb = new StringBuilder(str1);
        int l1 = str1.length();
        ch1 = str1.charAt(l1 - 1);
        ch2 = str2.charAt(0);
        if (Character.toString(ch2).equalsIgnoreCase(Character.toString(ch1))) {
            sb.append(str2.substring(1));
        } else {
            sb.append(" ");
            sb.append(str2);
        }
        System.out.println(sb.toString().toLowerCase());
    }
}
