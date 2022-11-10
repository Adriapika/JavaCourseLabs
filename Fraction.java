package SimpleFraction;

public class Fraction{
    public Number m;
    public Number n;
    public Fraction(Number m, Number n) throws ArithmeticException{
        ArithmeticException ArithmeticException = new ArithmeticException("Can't be zero");
        try{
            if(m == 0 || n == 0){
                throw ArithmeticException;
            }
            this.m = m / gcd(m,n);
            this.n = n / gcd(m,n);
        }
        catch (ArithmeticException e){
            System.out.println(m + "/" + n + " " + e.getMessage());
        }
    }

    public Fraction add(Fraction other) throws ArithmeticException{
        ArithmeticException ArithmeticException = new ArithmeticException("Zero Add");
        try{
            if(other.n == 0 || other.m == 0){
                throw ArithmeticException;
            }
            return new Fraction(this.m * other.n + this.n * other.m, this.n * other.n);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return new Fraction(m, n);
    }

    public Fraction sub(Fraction other) throws  ArithmeticException{
        ArithmeticException ArithmeticException = new ArithmeticException("Zero sub");
        try{
            if(other.n == 0 || other.m == 0){
                throw ArithmeticException;
            }
            return new Fraction(this.m * other.n - this.n * other.m, this.n * other.n);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return new Fraction(m, n);
    }

    public Fraction mul(Fraction other) throws  ArithmeticException{
        ArithmeticException ArithmeticException = new ArithmeticException("Multiply zero");
        try{
            if(other.n == 0 || other.m == 0){
                throw ArithmeticException;
            }
            return new Fraction(this.m * other.m, this.n * other.n);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return new Fraction(m, n);
    }

    public Fraction div(Fraction other) throws  ArithmeticException{
        ArithmeticException ArithmeticException = new ArithmeticException("Divide zero");
        try{
            if(other.n == 0 || other.m == 0){
                throw ArithmeticException;
            }
            return new Fraction(this.m * other.n, this.n * other.m);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return new Fraction(m, n);
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a % b);
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }

    @Override
    public int intValue() {
        return (Number)m/n;
    }

    @Override
    public long longValue() {
        return (Number)m/n;
    }

    @Override
    public float floatValue() {
        return (Number)m/n;
    }

    @Override
    public double doubleValue() {
        return (Number)m/n;
    }
}
