
import dev.fbandeira.primitive.easy.functional.primitiveRunLengthDecoding
import dev.fbandeira.primitive.easy.functional.primitiveRunLengthEncoding
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PrimitiveRunLengthEncodingFunctionalTest : FunSpec({
    test("runLengthEncoding should return encoded string") {
        primitiveRunLengthEncoding("AAAABBBCCDAA") shouldBe "4A3B2C1D2A"
    }

    test("runLengthEncoding with empty string should return empty string") {
        primitiveRunLengthEncoding("") shouldBe ""
    }

    test("primitiveRunLengthEncoding with single character should return '1A'") {
        primitiveRunLengthEncoding("A") shouldBe "1A"
    }

    test("primitiveRunLengthEncoding with single type character should return '5A'") {
        primitiveRunLengthEncoding("AAAAA") shouldBe "5A"
    }

    test("primitiveRunLengthEncoding with special characters should return '3@2!'") {
        primitiveRunLengthEncoding("@@@!!") shouldBe "3@2!"
    }

    test("primitiveRunLengthEncoding with numbers should return '312213'") {
        primitiveRunLengthEncoding("111223") shouldBe "312213"
    }
})

class PrimitiveRunLengthDecodingFunctionalTest : FunSpec({
    test("runLengthDecoding should return decoded string") {
        primitiveRunLengthDecoding("4A3B2C1D2A") shouldBe "AAAABBBCCDAA"
    }
    test("runLengthDecoding with empty string should return empty string") {
        primitiveRunLengthDecoding("") shouldBe ""
    }

    test("runLengthDecoding with single character should return 'A'") {
        primitiveRunLengthDecoding("A") shouldBe "1A"
    }

    test("runLengthDecoding with single type character should return 'AAAAA'") {
        primitiveRunLengthDecoding("AAAAA") shouldBe "5A"
    }

    test("runLengthDecoding with special characters should return '@@@!!'") {
        primitiveRunLengthDecoding("@@@!!") shouldBe "3@2!"
    }

    test("runLengthDecoding with numbers should return '111223'") {
        primitiveRunLengthDecoding("111223") shouldBe "312213"
    }

})

