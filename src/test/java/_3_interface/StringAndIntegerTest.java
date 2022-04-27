package _3_interface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringAndIntegerTest {
    String string;
    Integer integer;
    GenericInterface<String, Integer> stringAndInteger;

    @BeforeEach
    public void setup(){
        stringAndInteger = new StringAndInteger();
        string = "23";
        integer = 45;
    }

    @Test
    public void stringWorks(){
        assertThat(stringAndInteger.doSomeOperations(string)).isEqualTo(23);
    }

    @Test
    public void integerWorks(){
        assertThat(stringAndInteger.doReverseOperations(integer)).isEqualTo("45");
    }
}
