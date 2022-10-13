import java.util.Scanner;

public class l2_9 {
    public static double[][] generate_matrix(int n) {
        double[][] a = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (Math.random() * 2 * n) - n;
            }
        }
        System.out.println("\nInitial matrix: ");
        display_matrix(a);
        return a;
    }

    public static void display_matrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf(" %+5.3f |", matrix[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" \n");
    }

    public static double[][] new_matrix(double[][] matrix, int n) {
        double avarage = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                avarage += matrix[i][j];
            }
        }

        avarage /= (Math.pow(matrix.length, 2));
        double[][] new_a = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                new_a[i][j] = matrix[i][j] - avarage;
            }
        }
        System.out.println("New matrix: ");
        display_matrix(new_a);
        return new_a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = 0;
        n = sc.nextInt();
        double[][] a = generate_matrix(n);
        new_matrix(a, n);
    }
}
