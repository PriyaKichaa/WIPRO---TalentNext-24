import java.util.*;
/*
Given 2 int arrays, a and b, each length 3, 
return a new array length 2 containing their middle elements.

middleWay({1, 2, 3}, {4, 5, 6}) → {2, 5}
middleWay({7, 7, 7}, {3, 8, 0}) → {7, 8}
middleWay({5, 2, 9}, {1, 4, 5}) → {2, 4}

*/

public class MiddleElementArray {
    static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[a.length / 2];
        result[1] = b[b.length / 2];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        System.out.println("Enter 3 elements for Array 1: ");
        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 3 elements for Array 2: ");
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] result = middleWay(arr1, arr2);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
