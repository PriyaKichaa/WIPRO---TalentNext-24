import java.util.Scanner;
/*
8) Write a program to print the sum of the elements of an array following the given below condition. 
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22 [i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10

*/

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
