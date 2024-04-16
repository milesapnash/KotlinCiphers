import ciphers.SubstitutionCipher
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SubstitutionCipherTest {

    private var cipher = SubstitutionCipher()

    @Test
    fun testSubstitutionEncrypt() {
        val inputText = "HELLO"
        val key = "BCDEFGHIJKLMNOPQRSTUVWXYZA"
        val expectedOutput = "GDKKN"

        assertEquals(expectedOutput, cipher.encrypt(inputText, key))
    }

    @Test
    fun testSubstitutionDecrypt() {
        val cipherText = "VNQKC"
        val key = "BCDEFGHIJKLMNOPQRSTUVWXYZA"
        val expectedOutput = "WORLD"

        assertEquals(expectedOutput, cipher.decrypt(cipherText, key))
    }

    @Test
    fun testSubstitutionCipherCoherency() {
        val inputText = "SUBSTITUTIONCIPHER"
        val key = "BCDEFGHIJKLMNOPQRSTUVWXYZA"

        assertEquals(inputText, cipher.decrypt(cipher.encrypt(inputText, key), key))
    }
}