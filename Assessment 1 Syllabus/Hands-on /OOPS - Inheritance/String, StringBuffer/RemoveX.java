/*
7.	Given a string, if the first or last chars are 'x', 
return the string without those 'x' chars, otherwise return the string unchanged.

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".

*/
import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = str.length();
        if ((Character.toString(str.charAt(0))).equalsIgnoreCase("x")) {
            str = str.substring(1, l );
            l--;
        }
        if((Character.toString(str.charAt(l-1))).equalsIgnoreCase("x")) {
            str = str.substring(0, l-1 );
            l--;
        }
        System.out.println(str);
    }
}
