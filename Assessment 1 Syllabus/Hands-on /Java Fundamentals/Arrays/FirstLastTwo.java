import java.util.*;

/*
5) Write a program to find the largest 2 numbers and the smallest 2 numbers in the
given array.
*/

public class FirstLastTwo {
    static void sort(int arr[]) {
        int temp=0,n=arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(arr[j]<arr[i]) {
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sort(arr);
        for(int i=0;i<n;i++) {
            if(i<2)
                System.out.println(arr[i]);
            else if(i>n-3)
                System.out.println(arr[i]);
            else
                continue;
        }
    }
}
