import ciphers.vigenereDecrypt
import ciphers.vigenereEncrypt
import kotlin.test.Test
import kotlin.test.assertEquals

internal class VigenereCipherTest {

    @Test
    fun testVigenereEncrypt() {
        val inputText = "Hello"
        val key = "KEY"
        val expectedOutput = "Rijvs"

        assertEquals(expectedOutput, vigenereEncrypt(inputText, key))
    }

    @Test
    fun testVigenereDecrypt() {
        val cipherText = "Mehbt!"
        val key = "key"
        val expectedOutput = "Cajrp!"

        assertEquals(expectedOutput, vigenereDecrypt(cipherText, key))
    }

    @Test
    fun testVigenereCipherCoherency() {
        val inputText = "Vigenere"
        val key = "Cipher"

        assertEquals(inputText, vigenereDecrypt(vigenereEncrypt(inputText, key), key))
    }
}