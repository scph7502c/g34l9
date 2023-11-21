package textAnalyze;


public class TextAnalyzer {
    public TextAnalysisResult analyzeText(String text) {
        boolean containsCharacters = containsAnyCharacter(text);
        boolean isPalindrome = isPalindrome(text);
        int textLength = calculateTextLength(text);

        return new TextAnalysisResult(containsCharacters, isPalindrome, textLength);
    }

    private boolean containsAnyCharacter(String text) {
        return !text.isEmpty();
    }

    private boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private int calculateTextLength(String text) {
        return text.length();
    }
}