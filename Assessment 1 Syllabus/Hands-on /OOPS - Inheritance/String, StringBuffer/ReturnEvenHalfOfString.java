/*

4.	Write a java program that will return the first half of the string, 
    if the length of the string is even. It should return null for odd length string.

Example1)
	i/p: TomCat
	o/p: Tom
Example2)
	i/p: Apron
	o/p: null
*/

import java.util.Scanner;

public class ReturnEvenHalfOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = null;
        if(str.length()%2==0){
            res = str.substring(0, str.length()/2);
        }
        System.out.println(res);
    }
}

