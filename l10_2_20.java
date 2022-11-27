package home_work;

import java.util.Arrays;
import java.util.Scanner;

public class l10_2_20 {

    static boolean check(int arr[])
    {
        int N = arr.length;
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                inc = false;
            }
        }
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] strings = string.split("([\\W\\s]+)");
        int arr[] = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = strings[i].length();
        }
        boolean res = check(arr);
        if (res == true)
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}