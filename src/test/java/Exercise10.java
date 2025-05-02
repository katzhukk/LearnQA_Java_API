import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise10 {

    @ParameterizedTest
    @ValueSource(strings = {"Hello, world", "London is the capital of Great Britain"})
    void CheckLengthTest(String condition){
        assertTrue(condition.length() < 15);
    }
}
