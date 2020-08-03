import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommifier {
    public String insertMommy(String original) {
        if (!isOverThirtyPercent(original)) { return original; }

        List<String> characters = getAllCharacters(original);
        for (int i = 0; i < characters.size() - 1; ++i) {
            if (characters.get(i).matches("[aeiou]") && characters.get(i + 1).matches("[aeiou]")) {
                characters.add(i + 1, "mommy");
            }
        }

        StringBuilder result = new StringBuilder();
        for (String character : characters) {
            result.append(character);
        }

        return result.toString();
    }

    private List<String> getAllCharacters(String original) {
        List<String> characters = new ArrayList<>();
        for (int i = 0; i < original.length(); ++i) {
            char currentCharacter = original.charAt(i);
            characters.add(String.valueOf(currentCharacter));
        }

        return characters;
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
