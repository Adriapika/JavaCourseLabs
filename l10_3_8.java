package home_work;

import java.util.Scanner;
public class l10_3_8 {
    public static String encrypt(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append((char) ((c + n - 'a') % 26 + 'a'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int par = sc.nextInt();
        System.out.println(encrypt(string, par));
    }

}