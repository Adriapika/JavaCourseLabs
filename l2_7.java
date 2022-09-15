public class l2_7 {

    public static void main(String args[]){

        double dobutok = 1;

        for(String arg: args) {
            dobutok *= Double.parseDouble(arg);
        }

        System.out.println("Multiplication : "+ dobutok);
    }
}