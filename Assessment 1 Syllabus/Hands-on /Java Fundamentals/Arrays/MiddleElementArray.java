import java.util.*;

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
