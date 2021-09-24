package jetbrain.org.demo;

public class B {
    private int b;
    int c;

    public void invokeA() {
        A objA = new A(); // (4)
        int a = objA.a;   // (5)
    }
}
