import ciphers.substitutionDecrypt
import ciphers.substitutionEncrypt
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SubstitutionCipherTest {

    @Test
    fun testSubstitutionEncrypt() {
        val inputText = "HELLO"
        val key = "BCDEFGHIJKLMNOPQRSTUVWXYZA"
        val expectedOutput = "GDKKN"

        assertEquals(expectedOutput, substitutionEncrypt(inputText, key))
    }

    @Test
    fun testSubstitutionDecrypt() {
        val cipherText = "VNQKC"
        val key = "BCDEFGHIJKLMNOPQRSTUVWXYZA"
        val expectedOutput = "WORLD"

        assertEquals(expectedOutput, substitutionDecrypt(cipherText, key))
    }

    @Test
    fun testSubstitutionCipherCoherency() {
        val inputText = "SUBSTITUTIONCIPHER"
        val key = "BCDEFGHIJKLMNOPQRSTUVWXYZA"

        assertEquals(inputText, substitutionDecrypt(substitutionEncrypt(inputText, key), key))
    }
}