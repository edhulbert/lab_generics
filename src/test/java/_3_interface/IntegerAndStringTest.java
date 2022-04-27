package _3_interface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IntegerAndStringTest {

    String string;
    Integer integer;
    GenericInterface<Integer, String> integerAndString;

    @BeforeEach
    public void setup(){
        integerAndString = new IntegerAndString();
        string = "23";
        integer = 45;
    }

    @Test
    public void stringWorks(){
        assertThat(integerAndString.doSomeOperations(integer)).isEqualTo("45");
    }

    @Test
    public void integerWorks(){
        assertThat(integerAndString.doReverseOperations(string)).isEqualTo(23);
    }
}
