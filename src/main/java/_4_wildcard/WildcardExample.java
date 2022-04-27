package _4_wildcard;

import java.util.List;

public class WildcardExample {

    public void printNames_fathersAndChildrenOnly(List<? extends Father> people) {
        for (Object person : people) {
            System.out.println(person);
        }
    }

    public void printNames_grandpasAndFathersOnly(List<? super Father> people) {
        for (Object person : people) {
            System.out.println(person);
        }
    }

    public void printNames_allFamily(List<? super Child> people) {
        for (Object person : people){
            System.out.println(person);
        }

    }

}
