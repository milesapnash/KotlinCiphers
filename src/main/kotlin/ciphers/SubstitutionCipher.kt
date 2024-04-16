package ciphers

class SubstitutionCipher {
    private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun encrypt(plainText: String, mapping: String): String {
        return plainText.uppercase().map {
            alphabet[mapping.indexOf(it)]
        }.joinToString("")
    }

    fun decrypt(cipherText: String, mapping: String): String {
        return cipherText.uppercase().map {
            mapping[alphabet.indexOf(it)]
        }.joinToString("")
    }
}
