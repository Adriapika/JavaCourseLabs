import java.util.Scanner;
public class l4_1E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("y = x^5 + x^3 + x\n");
        System.out.print("Enter x: ");
        double x = input.nextFloat();
        double res = 0;
        for (int i = 1; i < 6; i += 2){
            res += Math.pow(x, i);
        }
        System.out.printf("Result: %f", res);
    }
}
