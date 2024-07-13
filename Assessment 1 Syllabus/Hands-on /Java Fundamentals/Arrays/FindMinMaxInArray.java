import java.util.Scanner;

/*
Write a program to initialize an integer array and find the maximum and minimum value of the array.
*/
public class FindMinMaxInArray {
    static int findmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr)
            if (max < i)
                max = i;
        return max;
    }

    static int findmin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr)
            if (min > i)
                min = i;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int max = findmax(arr);
        int min = findmin(arr);
        System.out.println(min);
        System.out.println(max);
    }
}
