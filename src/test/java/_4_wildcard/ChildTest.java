package _4_wildcard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChildTest {

    Child child;

    @BeforeEach
    public void setup() {
        child = new Child( "Ed");
    }

    @Test
    public void toStringReturnsGrandpa(){
        assertThat(child.toString()).isEqualTo("Grandpa{name='Mike'}");
    }
}
