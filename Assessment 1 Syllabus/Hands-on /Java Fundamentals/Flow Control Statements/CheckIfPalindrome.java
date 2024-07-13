/*
Q17 Write a Java program to find if the given number is palindrome or not.
 Example1) C:\>java Sample 110011
           O/P: 110011 is a palindrome
Example2) C:\>java Sample 1234 
           O/P: 1234 is not a palindrome

*/

public class CheckIfPalindrome {
    static void reverse(String s) {
        String rev = "";
        char ch;
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            rev = rev + ch;
        }
        if (rev.equals(s))
            System.out.println(s + " is a palindrome.");
        else
            System.out.println(s + " is not a palindrome.");
    }

    public static void main(String[] args) {
        reverse(args[0]);
    }
}