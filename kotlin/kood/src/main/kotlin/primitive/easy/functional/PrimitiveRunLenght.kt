package dev.fbandeira.primitive.easy.functional

fun primitiveRunLengthEncoding(input: String): String {
    var result = ""
    var count = 1
    for (i in 0 until input.length - 1) {
        if (input[i] == input[i + 1]) {
            count++
        } else {
            result += "$count${input[i]}"
            count = 1
        }
    }
    result += "$count${input[input.length - 1]}"
    return result
}

fun primitiveRunLengthDecoding(input: String): String {
    var result = ""
    var i = 0
    while (i < input.length) {
        var count = ""
        while (i < input.length && input[i].isDigit()) {
            count += input[i]
            i++
        }
        val char = input[i]
        for (j in 0 until count.toInt()) {
            result += char
        }
        i++
    }
    return result
}