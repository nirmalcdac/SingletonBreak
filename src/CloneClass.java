public class CloneClass implements Cloneable {
    @Override
    //This class has been added to create instance using clone
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
