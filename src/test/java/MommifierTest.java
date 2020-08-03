import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_return_original_when_vowels_are_not_over_30_percent_in_original_string() {
        String original = "happy";
        Mommifier mommifier = new Mommifier();

        String result = mommifier.insertMommy(original);

        assertEquals(original, result);
    }
}
