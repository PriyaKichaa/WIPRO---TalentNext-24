public class BiggestOf3x3Matrix {
    public static void main(String[] args) {
        if (args.length < 9 || args.length==0) {
            System.out.println("Please enter 9 integer numbers");
        } else {
            int k = 0;
            int[][] matrix = new int[3][3];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = Integer.parseInt(args[k]);
                    k++;
                }
            }
            System.out.println("The given array is");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                    if (max < matrix[i][j]) {
                        max = matrix[i][j];
                    }
                }
                System.out.println();
            }
            System.out.println("The biggest number in the given array is " + max);
        }
    }
}
