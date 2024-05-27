import dev.fbandeira.complex.easy.functional.runLengthDecoding
import dev.fbandeira.complex.easy.functional.runLengthEncoding
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RunLengthEncodingFunctionalTest : FunSpec({
    test("runLengthEncoding should return encoded string") {
        runLengthEncoding("AAAABBBCCDAA") shouldBe "4A3B2C1D2A"
    }

    test("runLengthEncoding with empty string should return empty string") {
        runLengthEncoding("") shouldBe ""
    }

    test("runLengthEncoding with single character should return '1A'") {
        runLengthEncoding("A") shouldBe "1A"
    }

    test("runLengthEncoding with single type character should return '5A'") {
        runLengthEncoding("AAAAA") shouldBe "5A"
    }

    test("runLengthEncoding with special characters should return '3@2!'") {
        runLengthEncoding("@@@!!") shouldBe "3@2!"
    }

    test("runLengthEncoding with numbers should return '312213'") {
        runLengthEncoding("111223") shouldBe "312213"
    }
})

class RunLengthDecodingFunctionalTest : FunSpec({
    test("runLengthDecoding should return decoded string") {
        runLengthDecoding("4A3B2C1D2A") shouldBe "AAAABBBCCDAA"
    }
    test("runLengthDecoding with empty string should return empty string") {
        runLengthEncoding("") shouldBe ""
    }

    test("runLengthDecoding with single character should return 'A'") {
        runLengthEncoding("A") shouldBe "1A"
    }

    test("runLengthDecoding with single type character should return 'AAAAA'") {
        runLengthEncoding("AAAAA") shouldBe "5A"
    }

    test("runLengthDecoding with special characters should return '@@@!!'") {
        runLengthEncoding("@@@!!") shouldBe "3@2!"
    }

    test("runLengthDecoding with numbers should return '111223'") {
        runLengthEncoding("111223") shouldBe "312213"
    }

})