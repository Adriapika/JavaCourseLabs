package Connection;

public class l7_1 {
    public static void main(String[] args){
        String[] messages = {"message121", "message565", "message321"};
        ConnectionManager cm = new ConnectionManager(messages);
        while(cm.existConnection()){
            ConnectionManager.getConnection().show();
        }
    }

}
