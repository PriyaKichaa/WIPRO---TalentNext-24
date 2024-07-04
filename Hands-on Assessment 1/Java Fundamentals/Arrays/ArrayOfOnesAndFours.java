import java.util.*;

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
