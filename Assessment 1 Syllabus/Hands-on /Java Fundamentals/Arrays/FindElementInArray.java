
import java.util.Scanner;
public class FindElementInArray {
     static int findElement(int[] arr, int num)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==num)
                index=i;
        return index;
    }
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int num=sc.nextInt();
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    int index=findElement(arr,num);
    System.out.println(index);
    sc.close();
}
    
}
  
