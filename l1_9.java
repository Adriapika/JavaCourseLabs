package l1_9;

/** Represents a l1_9 untitled1209.
 * <strong> ЗАГОЛОВОК </strong>
 * <p> Покупайте биток пока есть время </p>
 * @author Arsenii Driapika
 * @version 1.0
 * @since 1.0
 */
public class l1_9 {
    /**
     * Username input from command line
     */
    private String username;

    public static void main(String args[]){
        l1_9 obj = new l1_9();


        if(args.length<1){
            System.out.println("Incorrect Input");
        } else {
            obj.username = args[0];
            System.out.println(obj.username);
        }
    }
}