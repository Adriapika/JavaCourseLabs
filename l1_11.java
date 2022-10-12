import java.util.Scanner;
public class l1_11 {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter range of data: ");
        int range = scan.nextInt();
        System.out.print("Enter data of X's: ");
        String[] arr1 = get.nextLine().split(" ");
        System.out.print("Enter data of Y's: ");
        String[] arr2 = get.nextLine().split(" ");
        System.out.print("Enter data of Masse's: ");
        String[] arr3 = get.nextLine().split(" ");
        double total_mass = 0; double mul_x_mass = 0; double mul_y_mass = 0;
        for(int i = 0; i < range; ++i){
            mul_x_mass += Double.parseDouble(arr1[i])*Double.parseDouble(arr3[i]);
            mul_y_mass += Double.parseDouble(arr2[i])*Double.parseDouble(arr3[i]);
            total_mass += Double.parseDouble(arr3[i]);
        }
        System.out.printf("Center of mass is (x:%f,y:%f)", mul_x_mass / total_mass,  mul_y_mass / total_mass);
    }
}
