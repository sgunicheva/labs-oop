package myfirstpackage;

public class MySecondClass {
    private int a;
    private int b;
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setA(int resA) {
        this.a = resA;
    }
    public void setB(int resB) {
        this.b = resB;
    }
    public MySecondClass() {
        this.a = 0;
        this.b = 0;
    }
    public MySecondClass(int resA, int resB) {
        this.a = resA;
        this.b = resB;
    }
    public int getRes() {
        return a*b;
    }
}