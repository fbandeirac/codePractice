import dev.fbandeira.primitive.easy.OOP.PrimitiveRunLength
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PrimitiveRunLengthTest {

    private val primitiveRunLength = PrimitiveRunLength()

    @Test
    fun testprimitiveprimitiveRunLengthEncoding() {
        val result = primitiveRunLength.encode("AAAABBBCCDAA")
        assertEquals("4A3B2C1D2A", result)
    }

    @Test
    fun testprimitiveRunLengthEncodingWithEmptyString() {
        val result = primitiveRunLength.encode("")
        assertEquals("", result)
    }

    @Test
    fun testprimitiveRunLengthEncodingWithSingleCharacter() {
        val result = primitiveRunLength.encode("A")
        assertEquals("1A", result)
    }

    @Test
    fun testprimitiveRunLengthEncodingWithSingleTypeCharacter() {
        val result = primitiveRunLength.encode("AAAAA")
        assertEquals("5A", result)
    }

    @Test
    fun testprimitiveRunLengthEncodingWithSpecialCharacters() {
        val result = primitiveRunLength.encode("@@@!!")
        assertEquals("3@2!", result)
    }

    @Test
    fun testprimitiveRunLengthEncodingWithNumbers() {
        val result = primitiveRunLength.encode("111223")
        assertEquals("312213", result)
    }

    @Test
    fun testprimitiveRunLengthDecoding() {
        val result = primitiveRunLength.decode("4A3B2C1D2A")
        assertEquals("AAAABBBCCDAA", result)
    }

    @Test
    fun testprimitiveRunLengthDecodingWithEmptyString() {
        val result = primitiveRunLength.decode("")
        assertEquals("", result)
    }

    @Test
    fun testprimitiveRunLengthDecodingWithSingleCharacter() {
        val result = primitiveRunLength.decode("1A")
        assertEquals("A", result)
    }

    @Test
    fun testprimitiveRunLengthDecodingWithSingleTypeCharacter() {
        val result = primitiveRunLength.decode("5A")
        assertEquals("AAAAA", result)
    }

    @Test
    fun testprimitiveRunLengthDecodingWithSpecialCharacters() {
        val result = primitiveRunLength.decode("3@2!")
        assertEquals("@@@!!", result)
    }

    @Test
    fun testprimitiveRunLengthDecodingWithNumbers() {
        val result = primitiveRunLength.decode("312213")
        assertEquals("111223", result)
    }
}