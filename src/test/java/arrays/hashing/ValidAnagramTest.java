package arrays.hashing;

import arrays.hashing.ValidAnagram;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void testAnagramWithValidInput() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertThat(validAnagram.isAnagram("listen", "silent")).isTrue();
    }

    @Test
    void testAnagramWithDifferentLengths() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertThat(validAnagram.isAnagram("hello", "helloo")).isFalse();
    }

    @Test
    void testAnagramWithSameLettersDifferentCounts() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertThat(validAnagram.isAnagram("aabbcc", "abc")).isFalse();
    }

    @Test
    void testAnagramWithEmptyStrings() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertThat(validAnagram.isAnagram("", "")).isTrue();
    }

    @Test
    void testAnagramWithSingleCharacter() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertThat(validAnagram.isAnagram("a", "a")).isTrue();
        assertThat(validAnagram.isAnagram("a", "b")).isFalse();
    }

    @Test
    void testAnagramWithNonAnagrams() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertThat(validAnagram.isAnagram("rat", "car")).isFalse();
    }
}
