import java.util.Scanner;

/*

6) Write a program to initialize an array and print them in a sorted order.
*/

public class SortArray {
    static void sort(int arr[]) {
        int temp = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr)
            System.out.print(i + " ");
    }
}