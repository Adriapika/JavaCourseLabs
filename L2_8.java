import java.util.Scanner;
public class L2_8 {
    public static int add(int num1, int num2){
        int carry = 0x00;
        while(num2 != 0x00){
            carry = (num1 & num2);
            num1 = num1 ^ num2;
            num2 = (carry << 1);
        }
        return num1;
    }
    public static int mul(int num1, int num2){
        int result = 0;
        while(num2 != 0){
            if((num2 & 1) == 1){
                result = add(result, num1);
            }
            num1 <<= 1;
            num2 >>= 1;
        }
        return result;
    }
    static float divide(float num1, float num2)
    {
        float sign = ((num1 < 0) ^ (num2 < 0)) ? -1 : 1;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        float quotient = 0;
        while (num1 >= num2) {
            num1 -= num2;
            ++quotient;
        }
        if (sign == -1)
            quotient = -quotient;
        return quotient;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any num 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter any num 2: ");
        int num2 = scan.nextInt();
        System.out.println(mul(num1, num2));
        System.out.println(divide(num1, num2));
    }
}
