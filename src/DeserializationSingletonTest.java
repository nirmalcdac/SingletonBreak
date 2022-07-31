import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class DeserializationSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonClass instance = SingletonClass.getInstance();
        System.out.println(instance.hashCode());
        //This way we can create instance using serialisation
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
        out.writeObject(instance);
        out.close();
        ObjectInput in = new ObjectInputStream(new FileInputStream(("file.txt")));
        SingletonClass inst4 = (SingletonClass) in.readObject();
        in.close();
        System.out.println(inst4.hashCode());
    }
}
