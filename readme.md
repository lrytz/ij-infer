```
// Java

package example;
public class E1<S> {
    public interface I<T> { }
}

package example;
public class E2 {
    public interface I<T> { }
}

package example;
public class O<T> { }

package example;
public class U1 extends E1<String> {
    public static I<String> m() { return null; }
}

package example;
public class U2 extends E2 {
    public static I<String> m() { return null; }
}

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

// Scala

package example
class C {
  def ref1[U](i: E1.I[U]): O[U] = ???
  def ref2[U](i: E2.I[U]): O[U] = ???
}
```