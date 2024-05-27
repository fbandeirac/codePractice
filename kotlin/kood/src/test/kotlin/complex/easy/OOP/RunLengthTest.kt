import dev.fbandeira.complex.easy.OOP.RunLength
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RunLengthTest {

    private val runLength = RunLength()

    @Test
    fun testRunLengthEncoding() {
        val result = runLength.encode("AAAABBBCCDAA")
        assertEquals("4A3B2C1D2A", result)
    }

    @Test
    fun testRunLengthEncodingWithEmptyString() {
        val result = runLength.encode("")
        assertEquals("", result)
    }

    @Test
    fun testRunLengthEncodingWithSingleCharacter() {
        val result = runLength.encode("A")
        assertEquals("1A", result)
    }

    @Test
    fun testRunLengthEncodingWithSingleTypeCharacter() {
        val result = runLength.encode("AAAAA")
        assertEquals("5A", result)
    }

    @Test
    fun testRunLengthEncodingWithSpecialCharacters() {
        val result = runLength.encode("@@@!!")
        assertEquals("3@2!", result)
    }

    @Test
    fun testRunLengthEncodingWithNumbers() {
        val result = runLength.encode("111223")
        assertEquals("312213", result)
    }

    @Test
    fun testRunLengthDecoding() {
        val result = runLength.decode("4A3B2C1D2A")
        assertEquals("AAAABBBCCDAA", result)
    }

    @Test
    fun testRunLengthDecodingWithEmptyString() {
        val result = runLength.decode("")
        assertEquals("", result)
    }

    @Test
    fun testRunLengthDecodingWithSingleCharacter() {
        val result = runLength.decode("1A")
        assertEquals("A", result)
    }

    @Test
    fun testRunLengthDecodingWithSingleTypeCharacter() {
        val result = runLength.decode("5A")
        assertEquals("AAAAA", result)
    }

    @Test
    fun testRunLengthDecodingWithSpecialCharacters() {
        val result = runLength.decode("3@2!")
        assertEquals("@@@!!", result)
    }

    @Test
    fun testRunLengthDecodingWithNumbers() {
        val result = runLength.decode("312213")
        assertEquals("111223", result)
    }
}