package dev.fbandeira.complex.easy.functional

/*
foldIndexed is used to iterate through the string, maintaining a running count of consecutive characters.
Accumulator Pair(result, count) is used to keep the encoded result and the count of the current character.
If the current character is the same as the next, increment the count.
Otherwise, append the count and character to the result and reset the count.
*/
fun runLengthEncoding(input: String): String {
    return input.foldIndexed(Pair("", 1)) { index, acc, char ->
        val (result, count) = acc
        if (index + 1 < input.length && char == input[index + 1]) {
            Pair(result, count + 1)
        } else {
            Pair(result + "$count$char", 1)
        }
    }.first
}

/*
chunked(2) splits the input string into pairs of characters (count and character).
fold is used to iterate through these pairs, repeating the character by the count and accumulating the result.
*/
fun runLengthDecoding(input: String): String {
    return input.chunked(2).fold("") { acc, chunk ->
        val count = chunk[0].toString().toInt()
        val char = chunk[1]
        acc + char.toString().repeat(count)
    }
}
