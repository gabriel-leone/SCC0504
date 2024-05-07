// Nome: Gabriel Pietro Leone   NUSP: 13874729

class A {
    private int m;
    private int n;
    public A(int mIn, int nIn) {
        m = mIn;
        n = nIn;
    }

    public void m1() {
        m = m + n;
    }
    public int getM() {
        return m;
    }
    public int getN() {
        return n;
    }
    public void setM(int mIn) {
        m = mIn;
    }
    public void setN(int nIn) {
        n = nIn;
    }
    public String toString() {
        return "A = ("+getM()+", "+getN()+")";
    }
}

public class B extends A {

    public B(int mIn, int nIn) {
        super(mIn, nIn);
    }

    @Override
    public void m1() {
        setM(getM() - getN());
    }

    @Override
    public String toString() {
        return "B = ("+getM()+", "+getN()+")";
    }

    public static void main(String[] args) {
    A a = new A(1, 2);
    A b = new B(1, 2);
    System.out.println(a + " " + b);
    a.m1();
    b.m1();
    System.out.println(a + " " + b);
    }
}   