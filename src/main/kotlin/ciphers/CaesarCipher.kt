package ciphers

class CaesarCipher {
    fun encrypt(plainText: String, key: Int): String {
        return plainText.map { charShift(it, key) }.joinToString("")
    }

    fun decrypt(cipherText: String, key: Int): String {
        return cipherText.map { charShift(it, -key) }.joinToString("")
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
