import java.util.*;

public class ReverseMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        int k = 0;
        int[][] reverse = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }
        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                reverse[i][j] = matrix[j][i];
            }
            reverse[0][0] = matrix[1][1];
            reverse[1][1] = matrix[0][0];
        }

        System.out.println("The reverse of the array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(reverse[i][j] + " ");
            }
            System.out.println();
        }
    }
}
