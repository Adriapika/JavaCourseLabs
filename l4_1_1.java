import java.util.Scanner;
public class l4_1_1 {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = scan.nextInt();
        String temp[] = new String[n];
        for(int i=0; i<n; i++){
            temp[i] = scan.next();
        }
        for(String x: temp){
            System.out.println(x);
        }
    }
}
