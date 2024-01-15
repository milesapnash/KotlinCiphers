import ciphers.caesarDecrypt
import ciphers.caesarEncrypt
import kotlin.test.Test
import kotlin.test.assertEquals

internal class CaesarCipherTest {

    @Test
    fun testCaesarEncrypt() {
        val inputText = "Hello"
        val key = 10
        val expectedOutput = "Rovvy"

        assertEquals(expectedOutput, caesarEncrypt(inputText, key))
    }

    @Test
    fun testCaesarDecrypt() {
        val cipherText = "Mehbt!"
        val key = 16
        val expectedOutput = "World!"

        assertEquals(expectedOutput, caesarDecrypt(cipherText, key))
    }
}