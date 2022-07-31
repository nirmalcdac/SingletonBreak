import java.io.Serial;
import java.io.Serializable;

public class SingletonClass extends CloneClass implements Serializable {
    private SingletonClass() {
        //This Fix is for reflection
        if (instance != null) {
            throw new IllegalArgumentException();
        }
    }

    //Below Fix is for deserialization
    @Serial
    private Object readResolve() {
        return instance;
    }

    //This way we can stop instance getting created using clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static SingletonClass instance;

    public static SingletonClass getInstance()  {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
