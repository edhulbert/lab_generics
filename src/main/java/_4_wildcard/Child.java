package _4_wildcard;

public class Child extends Father {

    public Child(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Child " + name ;
    }
}
