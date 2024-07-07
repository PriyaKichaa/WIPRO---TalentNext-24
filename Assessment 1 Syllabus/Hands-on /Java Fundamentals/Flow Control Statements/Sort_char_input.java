import java.util.*;

/*
Q4 Initialize two character variables in a program and display the characters in alphabetical order.
Example1) if the first character is 's' and second character is 'e', then the output should be e,s.
Example2) if the first character is 'a' and second character is 'e', then the output should be a,e.
*/

public class Sort_char_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        
        if (a > b)
            System.out.println(b + " " + a);
        else
            System.out.println(a + " " + b);
    }
}