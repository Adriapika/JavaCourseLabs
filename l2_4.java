import java.util.Scanner;

public class l2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Веддіть число градусів Цельсія С : ");
        int a = sc.nextInt();
        System.out.printf("F = %.1f%n", (9*(float)a/5+32));
    }
}