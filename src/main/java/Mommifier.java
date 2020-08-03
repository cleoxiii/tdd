import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommifier {
    public String insertMommy(String original) {
        if (!isOverThirtyPercent(original)) { return original; }
        throw new RuntimeException("will be delete later");
    }

    private boolean isOverThirtyPercent(String original) {
        String withoutVowel = original.replaceAll("^[aeiou]+$", "");
        int originalLength = original.length();
        int vowelCount = originalLength - withoutVowel.length();
        double vowelPercent = vowelCount / originalLength;
        if (vowelPercent > 0.3) { return true; }
        return false;
    }
}
