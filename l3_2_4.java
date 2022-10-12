public class l3_2_4 {
    static int sum_positive(int[][] matr) {
        int sum = 0, temp = 0, sign;
        boolean bool = false;
        for (int[] row: matr) {
            for (int i: row) {
                sign = Integer.signum(i);
                if (sign == -1 && bool)
                    temp += i;
                else if (sign == 1 || sign == 0) {
                    if (bool) {
                        bool = false;
                        break;
                    } else bool = true;
                }
            }
            if (bool) bool = false;
            else sum += temp;
            temp = 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {  { -10, 6, -2, 12},
                            { -11,  3, 2, -4},
                            { 15, -22, -4, 9},
                            { 12,  21,  32, -18} };

        System.out.println("Sum between 2 positive: " + sum_positive(matrix));
    }
}

