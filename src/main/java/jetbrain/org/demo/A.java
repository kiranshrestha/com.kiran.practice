package jetbrain.org.demo;

public class A {
    private int a;

    public void invokeB() {
        B objB = new B(); // (1)
        //int b = objB.b;   // (2)
        int c = objB.c;   // (3)
    }
}
