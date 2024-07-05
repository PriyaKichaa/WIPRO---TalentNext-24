import java.util.*;

public class RemoveDuplicates {
    static int[] removeDuplicates(int[] arr) {
        int[] newarr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newarr[k] = arr[i];
                k++;
            }
        }
        int[] result = new int[k];
        System.arraycopy(newarr, 0, result, 0, k);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Original array: " + Arrays.toString(arr));
        arr = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
    }
}