import _4_wildcard.Child;
import _4_wildcard.Father;
import _4_wildcard.Grandpa;
import _4_wildcard.WildcardExample;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Grandpa> grandpas = List.of(
                new Grandpa("Alfred"),
                new Grandpa("Ben"),
                new Grandpa("Christopher")
        );
        List<Father> fathers = List.of(
                new Father("Devon"),
                new Father("Eddie"),
                new Father("Frederick")
        );
        List<Child> children = List.of(
                new Child("Godfrey"),
                new Child("Ivor"),
                new Child("James")
        );

        List<String> names = List.of("Devon","Christopher");

        WildcardExample wildEx = new WildcardExample();

        // TEST 1 can pass all 3 types to this method, but only these three
        wildEx.printNames_allFamily(grandpas);
        wildEx.printNames_allFamily(fathers);
        wildEx.printNames_allFamily(children);
        // wildEx.printNames_allFamily(names);

        // TEST 2 can only pass grandpas and fathers
        wildEx.printNames_grandpasAndFathersOnly(grandpas);
        wildEx.printNames_grandpasAndFathersOnly(fathers);
        // wildEx.printNames_grandpasAndFathersOnly(children);

        // TEST 3 can only pass fathers and children
        //wildEx.printNames_fathersAndChildrenOnly(grandpas);
        wildEx.printNames_fathersAndChildrenOnly(fathers);
        wildEx.printNames_fathersAndChildrenOnly(children);

    }
}
