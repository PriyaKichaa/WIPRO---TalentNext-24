import java.util.Scanner;
/*

3.	Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
Example1)
	i/p: Wipro
	o/p: WiWiWiWiWi
*/

public class NcopiesOfFirstTwoChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String substr = str.substring(0,2);
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            sb.append(substr);
        }
        System.out.println(sb.toString());
    }
}
