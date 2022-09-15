import java.util.Scanner;

import static java.lang.Math.sqrt;

public class l2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Середнє геометричне : ");
        System.out.print(sqrt(a*b));
    }
}
