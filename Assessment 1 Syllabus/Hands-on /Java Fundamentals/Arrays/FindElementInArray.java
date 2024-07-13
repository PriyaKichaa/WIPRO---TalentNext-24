
import java.util.Scanner;

/*
3) Write a program to initialize an integer array with values 
and check if a given number is present in the array or not. 

If the number is not found, it will print -1,
else it will print the index value of the given number in the array.

Example 1) If the Array elements are {1,4,34,56,7} 
            and the search element is 90, 
            then the output expected is -1.

Example 2) If the Array elements are {1,4,34,56,7} 
            and the search element is 56, 
            then the output expected is 3.
*/

public class FindElementInArray {
    static int findElement(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
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
        int num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = findElement(arr, num);
        System.out.println(index);
        sc.close();
    }
}
  
