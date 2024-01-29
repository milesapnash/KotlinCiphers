package ciphers

private const val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

fun substitutionEncrypt(plainText: String, mapping: String): String {
    return plainText.uppercase().map {
        alphabet[mapping.indexOf(it)]
    }.joinToString("")
}

fun substitutionDecrypt(cipherText: String, mapping: String): String {
    return cipherText.uppercase().map {
        mapping[alphabet.indexOf(it)]
    }.joinToString("")
}
