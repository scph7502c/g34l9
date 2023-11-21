import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import textAnalyze.*;

public class TextAnalyzerTest {

    @Test
    void testNoCharacters() {
        // given
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        String emptyText = "";

        // when
        TextAnalysisResult result = textAnalyzer.analyzeText(emptyText);

        // then
        assertFalse(result.isContainsCharacters());
    }

    @Test
    void testNoPalindrome() {
        // given
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        String nonPalindromeText = "Nie jestem palindromem";

        // when
        TextAnalysisResult result = textAnalyzer.analyzeText(nonPalindromeText);

        // then
        assertTrue(result.isContainsCharacters());
        assertFalse(result.isPalindrome());
        assertEquals(nonPalindromeText.length(), result.getTextLength());
    }

    @Test
    void testPalindromeAndLength() {
        // given
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        String palindromeText = "Może jutro ta dama sama da tortu jeżom";

        // when
        TextAnalysisResult result = textAnalyzer.analyzeText(palindromeText);

        // then
        assertTrue(result.isContainsCharacters());
        assertTrue(result.isPalindrome());
        assertEquals(38, result.getTextLength());
    }
}