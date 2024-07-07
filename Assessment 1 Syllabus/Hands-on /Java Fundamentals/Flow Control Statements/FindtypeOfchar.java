import java.util.*;

/*
Q5 Initialize a character variable in a program and print 'Alphabet'.
If the initialized value is an alphabet,
print 'Digit' if the initialized value is a number,
and print 'Special Character' if the initialized value is anything else. 
*/


public class FindtypeOfchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Alphabet");
        else
            System.out.println("Special Character");
    }
}