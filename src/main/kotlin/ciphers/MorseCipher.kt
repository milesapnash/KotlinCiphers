package ciphers

class MorseCipher {
    private val charToMorseMap = mapOf(
        'A' to ".-", 'B' to "-...", 'C' to "-.-.", 'D' to "-..", 'E' to ".",
        'F' to "..-.", 'G' to "--.", 'H' to "....", 'I' to "..", 'J' to ".---",
        'K' to "-.-", 'L' to ".-..", 'M' to "--", 'N' to "-.", 'O' to "---",
        'P' to ".--.", 'Q' to "--.-", 'R' to ".-.", 'S' to "...", 'T' to "-",
        'U' to "..-", 'V' to "...-", 'W' to ".--", 'X' to "-..-", 'Y' to "-.--",
        'Z' to "--..",
        '0' to "-----", '1' to ".----", '2' to "..---", '3' to "...--",
        '4' to "....-", '5' to ".....", '6' to "-....", '7' to "--...",
        '8' to "---..", '9' to "----."
    )

    private val morseToCharMap = charToMorseMap.entries.associate { (k, v) -> v to k }

    fun encrypt(plainText: String): String {
        return plainText.uppercase().map {
            when (it) {
                ' ' -> "/ "
                in charToMorseMap.keys -> charToMorseMap[it] + " "
                else -> ""
            }
        }.joinToString("")
    }

    fun decrypt(morseCode: String): String {
        val morseCodeList = morseCode.split(" ").toTypedArray()

        return morseCodeList.map {
            when (it) {
                "/" -> " "
                in morseToCharMap.keys -> morseToCharMap[it]
                else -> ""
            }
        }.joinToString("")
    }
}
