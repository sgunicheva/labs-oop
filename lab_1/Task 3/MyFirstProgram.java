class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(10, 6);
        System.out.println(o.getRes());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.print(o.getRes());
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
class MySecondClass {
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
    MySecondClass() {
        this.a = 0;
        this.b = 0;
    }
    MySecondClass(int resA, int resB) {
        this.a = resA;
        this.b = resB;
    }
    public int getRes() {
        return a*b;
    }
}