import ciphers.MorseCipher
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MorseCipherTest {

    private var cipher = MorseCipher()

    @Test
    fun testMorseEncrypt() {
        val inputText = "HELLO"
        val expectedOutput = ".... . .-.. .-.. --- "

        assertEquals(expectedOutput, cipher.encrypt(inputText))
    }

    @Test
    fun testMorseDecrypt() {
        val morseCode = ".-- --- .-. .-.. -.."
        val expectedOutput = "WORLD"

        assertEquals(expectedOutput, cipher.decrypt(morseCode))
    }

    @Test
    fun testMorseCipherCoherency() {
        val inputText = "MORSE CODE"

        assertEquals(inputText, cipher.decrypt(cipher.encrypt(inputText)))
    }
}