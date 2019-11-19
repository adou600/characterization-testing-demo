import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternTest {

    @Test
    public void x() { //TODO: what does formatText do?
        //When
        String formatted = Pattern.formatText("plain text");

        //Then
        assertEquals(null, formatted);
    }

}