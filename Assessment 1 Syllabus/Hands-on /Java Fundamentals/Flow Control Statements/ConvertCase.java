import java.util.Scanner;

/*
Q7) Initialize a character variable with an alphabhet in a program. If the character value is in lowercase, the output should be displayed in uppercase in the following format.
Example1) i/p: a, o/p: a->A
If the character value is in uppercase, the output should be displayed in lowercase in the following format.
Example2) i/p: A, o/p: A->a
*/


public class ConvertCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            if (Character.isLowerCase(ch))
                System.out.println(ch + "-->" + Character.toUpperCase(ch));
            else if (Character.isUpperCase(ch))
                System.out.println(ch + "-->" + Character.toLowerCase(ch));
        }
    }
}
