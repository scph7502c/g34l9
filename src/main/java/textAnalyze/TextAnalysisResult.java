package textAnalyze;

public class TextAnalysisResult {
    private final boolean containsCharacters;
    private final boolean isPalindrome;
    private final int textLength;

    public TextAnalysisResult(boolean containsCharacters, boolean isPalindrome, int textLength) {
        this.containsCharacters = containsCharacters;
        this.isPalindrome = isPalindrome;
        this.textLength = textLength;
    }

    public boolean isContainsCharacters() {
        return containsCharacters;
    }

    public boolean isPalindrome() {
        return isPalindrome;
    }

    public int getTextLength() {
        return textLength;
    }
}