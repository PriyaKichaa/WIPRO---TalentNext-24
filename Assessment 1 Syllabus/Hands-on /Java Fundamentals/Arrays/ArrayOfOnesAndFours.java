import java.util.*;
/*
11) Given an array of ints, return true if every element is a 1 or a 4.

only14({1, 4, 1, 4}) → true
only14({1, 4, 2, 4}) → false
only14({1, 1}) → true

*/

public class ArrayOfOnesAndFours {
    static boolean only14(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = only14(arr);
        System.out.println(result);
        sc.close();
    }
}
