import java.util.Scanner;
public class l4_1_6 {
    static Scanner sc = new Scanner (System. in);
    static void find_number_with_minimum_number_of_digits(String[] str_arr) {
        int len_arr = str_arr.length;
        int min_len = 1000000000;
        for (int i = 0; i < len_arr; i++) {
            if (str_arr[i].length() < min_len)
                min_len = str_arr[i].length();
        }
        for (String el: str_arr)
            if (el.length() == min_len)
                System.out.println(el);
    }
    public static void main(String[] args) {
        String line = sc.nextLine();
        String[] str_mas = line.split(" ");
        System.out.println("number(s) with minimum number of digits: ");
        find_number_with_minimum_number_of_digits(str_mas);
    }
}


