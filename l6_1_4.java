package mypack;
class MyClass {
    protected int par = 1;
    void useProtected(l6_1_3 x){
        System.out.println("Out " + x.member3);
    }

}

public class l6_1_4 {
    public static   void main(String[] args){
        MyClass a = new MyClass();
        l6_1_3 b = new l6_1_3();
        b.member3 = 31;
        a.useProtected(b);
    }
}
