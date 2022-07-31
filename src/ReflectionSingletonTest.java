import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonClass instance = SingletonClass.getInstance();
        System.out.println(instance.hashCode());
        //This way we can create instance using reflection
        SingletonClass reflection = null;
        Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();
        for (Constructor con : constructors) {
            con.setAccessible(true);
            reflection = (SingletonClass) con.newInstance();
        }
        if (reflection != null) {
            System.out.println(reflection.hashCode());
        }
    }
}
