package example;

public class T {
    public void t1() {
        var c = new C();
        // Inlay Hint: O<Object>
        var x = c.ref1(U1.m());
        O<String> y = c.ref1(U1.m());
    }

    public void t2() {
        var c = new C();
        // Inlay Hint: O<String>
        var x = c.ref2(U2.m());
        O<String> y = c.ref2(U2.m());
    }
}
