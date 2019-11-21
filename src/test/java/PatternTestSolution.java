import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternTestSolution {

    @Test
    public void doesntChangeUnformattedText() {
        //When
        String formatted = Pattern.formatText("plain text");

        //Then
        assertEquals("plain text", formatted);
    }

    @Test
    public void removesTextBetweenAngleBracketPairs() {
        //When
        String formatted = Pattern.formatText("<h>");

        //Then
        assertEquals("", formatted);
    }

    @Test
    public void leavesTextAfterBracketPairs() {
        //When
        String formatted = Pattern.formatText("<h>asdf");

        //Then
        assertEquals("asdf", formatted);
    }

    @Test
    public void leavesTextBeforeBracketPairs() {
        //When
        String formatted = Pattern.formatText("asdf<h>");

        //Then
        assertEquals("asdf", formatted);
    }

    @Test
    public void removesEnclosingElement() {
        //When
        String formatted = Pattern.formatText("<h>test</h>");

        //Then
        assertEquals("test", formatted);
    }

}