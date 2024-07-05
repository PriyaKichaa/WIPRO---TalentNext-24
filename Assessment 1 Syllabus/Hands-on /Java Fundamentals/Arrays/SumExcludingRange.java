import java.util.Scanner;

public class SumExcludingRange {

    static int sumexcludingrange(int[] arr) {
        int sum = 0, i;
        int index = indexofseven(arr);
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 6 && (hasSeven(arr) && index>i)) {
                break;
            } else {
                sum += arr[i];
            }
        }
        if (index != -1) {
            for (int j = index+1; j > i && j < arr.length; j++) {
                sum += arr[j];
            }
        }
        return sum;
    }

    static boolean hasSeven(int[] arr) {
        boolean result = false;
        for (int i : arr) {
            if (i == 7) {
                result = true;
            }
        }
        return result;
    }

    static int indexofseven(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sumexcludingrange(arr);
        System.out.println(sum);
    }
}
