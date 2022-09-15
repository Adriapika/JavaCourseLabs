public class l1_6 {

    public static void main(String args[]){

        double summa = 0;

        for(String arg: args) {
            summa += Double.parseDouble(arg);
        }

        System.out.println("Sum : "+ summa);
    }
}