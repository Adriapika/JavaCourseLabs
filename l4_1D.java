import java.util.Scanner;

public class l4_1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("y = 16x^4 + 8x^3 + 4x^2 + 2x + 1\n");
        System.out.print("Enter x: ");
        double x = 2*input.nextFloat();
        double res = 0;
        for (int i = 0; i < 5; i++){
            res += Math.pow(x, i);
        }
        System.out.printf("Result: %f", res);
    }
}