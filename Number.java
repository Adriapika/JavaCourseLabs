package SimpleFraction;

public class Number {

    private final int number;

    public Number(){
        this.number = number;
    }

    public int add(Number other){
        return number + other.number;
    }

    public int sub(Number other){
        return number - other.number;
    }

    public int mul(Number other){
        return number * other.number;
    }

    public int div(Number other){
        return number / other.number;
    }

    @Override
    public String toString(){ return "" + number;}

}
