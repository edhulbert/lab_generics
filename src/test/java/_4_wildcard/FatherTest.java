package _4_wildcard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FatherTest {
    Father father;

    @BeforeEach
    public void setup() {
        father = new Father("Matt");
    }

    @Test
    public void toStringReturnsGrandpa(){
        assertThat(father.toString()).isEqualTo("Father{name='Mike'}");
    }
}