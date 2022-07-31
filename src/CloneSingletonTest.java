import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class CloneSingletonTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonClass inst1 = SingletonClass.getInstance();
        System.out.println(inst1.hashCode());
        //This code allows us to break singleton behaviour using clone
        SingletonClass instance = (SingletonClass) inst1.clone();
        System.out.println(instance.hashCode());
    }
}
