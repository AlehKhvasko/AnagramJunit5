import extensions.AfterTestTimerExtension;
import extensions.BeforeTestTimerExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({BeforeTestTimerExtension.class, AfterTestTimerExtension.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CheckAnagramTest {

    CheckAnagram checkAnagram;

    @BeforeAll
    void init() {
        checkAnagram = new CheckAnagram();
    }


    @Test
    void isAnagram_Two_Words() {
        assertTrue(checkAnagram.isAnagramCheck("angel", "glean"));
    }    
    
    @Test
    void isAnagram_Empty_Input_Provided() {
        assertFalse(checkAnagram.isAnagramCheck("", ""));
    }

    @Test
    void isAnagram_Empty_Space_Provided() {
        assertFalse(checkAnagram.isAnagramCheck(" ", " "));
    }

    @Test
    void isAnagram_Two_Empty_Spaces_Provided() {
        assertFalse(checkAnagram.isAnagramCheck("  ", "  "));
    }

    @Test
    void isAnagram_One_Letter_Provided() {
        assertTrue(checkAnagram.isAnagramCheck("a", "a"));
    }

    @Test
    void isAnagram_Two_Sentences() {
        assertTrue(checkAnagram.isAnagramCheck("a gentleman", "elegant man"));
    }

    @Test
    void isAnagram_Two_WordsInSentence() {
        assertTrue(checkAnagram.isAnagramCheck("schoolmaster", "the classroom"));
    }

    @Test
    void isAnagram_Numbers_As_String() {
        assertFalse(checkAnagram.isAnagramCheck("123", "123"));
    }
}