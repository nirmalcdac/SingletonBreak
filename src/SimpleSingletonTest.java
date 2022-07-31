import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class SimpleSingletonTest {
    public static void main(String[] args) {
        SingletonClass inst1 = SingletonClass.getInstance();
        System.out.println(inst1.hashCode());
        // Below code will give same output
        SingletonClass inst2 = SingletonClass.getInstance();
        System.out.println(inst2.hashCode());
    }
}
