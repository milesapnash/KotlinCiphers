import ciphers.CaesarCipher
import kotlin.test.Test
import kotlin.test.assertEquals

internal class CaesarCipherTest {

    private var cipher = CaesarCipher()

    @Test
    fun testCaesarEncrypt() {
        val inputText = "Hello"
        val key = 10
        val expectedOutput = "Rovvy"

        assertEquals(expectedOutput, cipher.encrypt(inputText, key))
    }

    @Test
    fun testCaesarDecrypt() {
        val cipherText = "Mehbt!"
        val key = 16
        val expectedOutput = "World!"

        assertEquals(expectedOutput, cipher.decrypt(cipherText, key))
    }

    @Test
    fun testCaesarCipherCoherency() {
        val inputText = "Caesar Cipher"
        val key = 13

        assertEquals(inputText, cipher.decrypt(cipher.encrypt(inputText, key), key))
    }
}