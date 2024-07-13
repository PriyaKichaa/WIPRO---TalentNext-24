import java.util.Scanner;
/*
Write a program to initialize an integer array and print the sum and average of the array.
*/

public class SumandAvgOfArray {

    static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int sum = sum(arr);
        System.out.println("Sum: "+sum);
        int avg = sum / n;
        System.out.println("Average: "+avg);
    }
}
