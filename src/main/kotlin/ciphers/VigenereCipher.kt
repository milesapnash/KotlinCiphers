package ciphers

class VigenereCipher {
    fun encrypt(plainText: String, key: String): String {
        var keyIndex = 0
        return plainText.map {
            val keyChar = key[keyIndex]
            val baseChar = if (keyChar.isUpperCase()) 'A' else 'a'
            keyIndex = (keyIndex + 1) % key.length

            charShift(it, keyChar - baseChar)
        }.joinToString("")
    }

    fun decrypt(cipherText: String, key: String): String {
        var keyIndex = 0
        return cipherText.map {
            val keyChar = key[keyIndex]
            val baseChar = if (keyChar.isUpperCase()) 'A' else 'a'
            keyIndex = (keyIndex + 1) % key.length

            charShift(it, -(keyChar - baseChar))
        }.joinToString("")
    }

    private fun charShift(inputChar: Char, shift: Int): Char {
        if (!inputChar.isLetter()) {
            return inputChar
        }

        val baseChar = if (inputChar.isUpperCase()) 'A' else 'a'
        val encryptedCharCode = ((inputChar - baseChar + shift) + 26) % 26 + baseChar.code

        return encryptedCharCode.toChar()
    }
}
