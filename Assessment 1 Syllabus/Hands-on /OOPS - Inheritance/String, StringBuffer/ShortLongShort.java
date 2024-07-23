/*
1.	Given 2 strings, a and b, return a new string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).
If input is "hi" and "hello", then output will be "hihellohi".

*/
import java.util.Scanner;

public class ShortLongShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String result = (str1.length() < str2.length()) ? str1 + str2 + str1 : str2 + str1 + str2;
        System.out.println(result);
    }
}
