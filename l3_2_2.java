import java.util.Objects;
import java.util.Scanner;

public class l3_2_2 {
    static void printMatrix(int[][] matr) {
        for (int[] i: matr) {
            for (int j: i) System.out.print(j + " ");
            System.out.println();
        } System.out.println();
    }

    static int[][] shift(int[][] matr, int k, String direction) {
        int n = matr.length;
        k = k % n;
        int[][] new_matr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (Objects.equals(direction, "right")) new_matr[i][j] = matr[i][(j + n - k) % n];
                if (Objects.equals(direction, "left"))  new_matr[i][j] = matr[i][(j + k) % n];
                if (Objects.equals(direction, "up"))    new_matr[i][j] = matr[(i + k) % n][j];
                if (Objects.equals(direction, "down"))  new_matr[i][j] = matr[(i + n - k) % n][j];
            }
        return new_matr;
    }

    public static void main(String[] args) {
       int[][] matrix = { { 11, 25, 85, 47},
                           { 30, 20, 10, 40 },
                           { 64, 65, 12, 45 },
                           { 14, 83, 55, 34 } };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original matrix");
        printMatrix(matrix);

        System.out.println("Shift right matrix");
        printMatrix(shift(matrix, k, "right"));

        System.out.println("Shift left matrix");
        printMatrix(shift(matrix, k, "left"));

        System.out.println("Shift up matrix");
        printMatrix(shift(matrix, k, "up"));

        System.out.println("Shift down matrix");
        printMatrix(shift(matrix, k, "down"));
    }
}

