import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import textAnalyze.*;


public class TextAnalyzerTest {

    @Test
    public void testWhenEmptyText() {
        // given
        String text = "";

        // when
        TextAnalyzer analyzer = new TextAnalyzer(text);

        // then
        assertFalse(analyzer.isPalindrome(text));
        assertEquals(0, analyzer.getLength());
    }

    @Test
    public void testIfPalindrome() {
        // given
        String text = "Może jutro ta dama sama da tortu jeżom";

        // when
        TextAnalyzer analyzer = new TextAnalyzer(text);

        // then
        assertTrue(analyzer.isPalindrome(text));
        assertEquals(38, analyzer.getLength());
    }

    @Test
    public void testIfNonPalindrome() {
        // given
        String text = "Listopad";

        // when
        TextAnalyzer analyzer = new TextAnalyzer(text);

        // then
        assertFalse(analyzer.isPalindrome(text));
        assertEquals(8, analyzer.getLength());
    }
}
