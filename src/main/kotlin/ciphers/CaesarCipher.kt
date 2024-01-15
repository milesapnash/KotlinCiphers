package ciphers

fun caesarEncrypt(plainText: String, key: Int): String {
    return plainText.map { charShift(it, key) }.joinToString("")
}

fun caesarDecrypt(cipherText: String, key: Int): String {
    return cipherText.map { charShift(it, -key) }.joinToString("")
}

private fun charShift(inputChar: Char, shift: Int): Char {
    if (!inputChar.isLetter()) {
        return inputChar
    }

    val base = if (inputChar.isUpperCase()) 'A' else 'a'
    val encryptedCharCode = ((inputChar - base + shift) % 26 + 26) % 26 + base.code

    return encryptedCharCode.toChar()
}