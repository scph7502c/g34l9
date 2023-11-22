package textAnalyze;

public class TextAnalyzer {

    private int textLength;

    public TextAnalyzer(String text) {
        this.textLength = text != null ? text.length() : 0;
        checkText(text);
    }

    private void checkText(String text) {
        if (hasCharacters(text)) {
            if (isPalindrome(text)) {
                System.out.println("Palindrom");
            } else {
                System.out.println("Tekst nie jest palindromem");
            }
            System.out.println("Liczba znaków: " + textLength);
        }
    }

    private boolean hasCharacters(String text) {
        return text != null && !text.trim().isEmpty();
    }

    public boolean isPalindrome(String text) {
        text = text != null ? text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "") : "";
        if (text.isEmpty()) {
            return false;
        }

        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int getLength() {
        return textLength;
    }
}