package _4_wildcard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GrandpaTest {

    Grandpa grandpa;

    @BeforeEach
    public void setup() {
        grandpa = new Grandpa("Mike");
    }

    @Test
    public void toStringReturnsGrandpa(){
        assertThat(grandpa.toString()).isEqualTo("Grandpa{name='Mike'}");
    }
}
