import java.util.Scanner;
public class l4_7 {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter first side from 0 to 1: ");
        float tem1 = scan.nextFloat();
        System.out.print("Enter second side from 0 to 1: ");
        float tem2 = scan.nextFloat();
        System.out.print("Enter third side from 0 to 1: ");
        float tem3 = scan.nextFloat();
        //System.out.printf("%f, %f, %f", tem1, tem2, tem3);
        if (Math.pow(tem1, 2) > (Math.pow(tem2, 2) + Math.pow(tem3, 2)) || Math.pow(tem2, 2) > (Math.pow(tem1, 2) + Math.pow(tem3, 2)) || Math.pow(tem3, 2) > (Math.pow(tem2, 2) + Math.pow(tem1, 2))){
            System.out.printf("Triagle with sides %.3f, %.3f, %.3f is Obtuse-angled", tem1, tem2, tem3);
        }
        else{
            System.out.printf("Triagle with sides %.3f, %.3f, %.3f is not Obtuse-angled", tem1, tem2, tem3);
            }
    }
}
