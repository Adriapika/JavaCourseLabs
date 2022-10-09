import java.util.Scanner;
class l4_1_4 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input line: ");
        String line = scan.nextLine();
        String[] parsed = line.split(" ");
        int Max = Integer.parseInt(parsed[0]);
        int maxInRow = Max;
        int countInRow = 1;
        int maxCount = 1;
        int prev = Integer.MIN_VALUE;
        for(String p: parsed){
            int val = Integer.valueOf(p);
            if(val>Max){
                Max = val;
            }
            if(val==prev){
                countInRow++;
            }
            else{
                if(countInRow>maxCount){
                    maxCount = countInRow;
                    maxInRow = prev;
                }
                countInRow = 1;
                prev = val;
            }
        }
        System.out.println("Max in sequence " + maxInRow + " is " + maxCount + " times here");
    }
}

