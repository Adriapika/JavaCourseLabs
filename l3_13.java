import java.util.Scanner;
public class l3_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer from 0 to 10000: ");
        double temp = input.nextFloat();
        temp = Math.pow(temp, 8);
        System.out.printf("Result: %20.4f%n", temp);
    }
}
