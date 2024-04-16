import ciphers.VigenereCipher
import kotlin.test.Test
import kotlin.test.assertEquals

internal class VigenereCipherTest {

    private var cipher = VigenereCipher()

    @Test
    fun testVigenereEncrypt() {
        val inputText = "Hello"
        val key = "KEY"
        val expectedOutput = "Rijvs"

        assertEquals(expectedOutput, cipher.encrypt(inputText, key))
    }

    @Test
    fun testVigenereDecrypt() {
        val cipherText = "Mehbt!"
        val key = "key"
        val expectedOutput = "Cajrp!"

        assertEquals(expectedOutput, cipher.decrypt(cipherText, key))
    }

    @Test
    fun testVigenereCipherCoherency() {
        val inputText = "Vigenere"
        val key = "Cipher"

        assertEquals(inputText, cipher.decrypt(cipher.encrypt(inputText, key), key))
    }
}