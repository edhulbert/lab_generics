package _4_wildcard;

public class Father extends Grandpa{

    public Father(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Father " + name ;
    }
}
