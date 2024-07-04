import java.util.Arrays;
import java.util.Scanner;

public class RemoveTens {
    static int[] withoutTen(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                count++;
                swapelements(arr, i);
            }
        }
        return arr;
    }

    static void swapelements(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            arr[i + 1] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = withoutTen(arr);
        System.out.println(Arrays.toString(ans));
    }
}
