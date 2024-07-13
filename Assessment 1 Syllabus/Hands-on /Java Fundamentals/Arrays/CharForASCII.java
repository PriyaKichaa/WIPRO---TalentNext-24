import java.util.Scanner;

/*
4) Initialize an integer array with ascii values and 
print the corresponding character values in a single row.

*/

public class CharForASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i : arr)
            System.out.print((char) i + " ");
    }
}
