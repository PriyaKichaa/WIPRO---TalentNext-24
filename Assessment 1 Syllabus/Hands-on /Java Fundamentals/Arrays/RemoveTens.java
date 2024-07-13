import java.util.Arrays;
import java.util.Scanner;
/*
Print a version of the given array where all the 10's have been removed. 
The remaining elements should shift left towards the start of the array as needed, 
and the empty spaces a the end of the array should be 0. 

So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
You may modify and return the given array or make a new array.

withoutTen({1, 10, 10, 2}) → {1, 2, 0, 0}
withoutTen({10, 2, 10}) → {2, 0, 0}
withoutTen({1, 99, 10}) → {1, 99, 0}

*/

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
