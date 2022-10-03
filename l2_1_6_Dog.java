public class l2_1_6_Dog {
    private String name;
    private String say;
    l2_1_6_Dog(String name, String say){
        this.name = name;
        this.say = say;
    }
    public void displayInfo(){
        System.out.printf("%s says %s \n", this.name, this.say);
    }
    public static void main(String[] args) {
        l2_1_6_Dog l216Dog1 = new l2_1_6_Dog("Spot", "Ruff!");
        l2_1_6_Dog l216Dog2 = new l2_1_6_Dog("Scruffy", "Wurf!");
        l216Dog1.displayInfo();
        l216Dog2.displayInfo();
        l2_1_6_Dog l216Dog3 = l216Dog1;
        System.out.println(l216Dog3 == l216Dog1);
        System.out.println(l216Dog3.equals(l216Dog1));
    }
}